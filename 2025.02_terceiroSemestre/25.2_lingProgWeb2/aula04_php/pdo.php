<?php
//mysql é um metodo de acsso ao anco de dados MySql
$servername = "localhost";
$database = "php";
$username = "root";
$password = "senac";
$sql = "mysql:host=$servername;dbname:$database;";
$dsn_optionns = [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION];
//Testando conexão
try{
    $my_db_Connection = new PDO($servername, $username, $password, $dsn_optionns);
    echo"Conexão realizada com sucesso";
}catch(PDOException $e){
    echo "Conexão deu erro: ". $e->getMessage();
}

// criar as variaveis para inserts
$nome = "teste";
$ultimonome = "teste";
$email = "teste@teste";
// antes de inderir, preparamos o insert = preparando stantement
$my_Insert_Statenment = $my_db_Connection -> prepare("INSERT INTO alunos('nome';'ultimonome','email'))
    VALUES (:nome,:ultimonome,:email;");

$my_Insert_Statenment -> bindParam(':nome',$nome);
$my_Insert_Statenment -> bindParam(':ultimonome',$ultimonome);
$my_Insert_Statenment -> bindParam('email',$email);

if($my_Insert_Statenment -> execute()){
    echo "Registro criando com sucesso";
}else{
    echo "Deu bom...";
}


