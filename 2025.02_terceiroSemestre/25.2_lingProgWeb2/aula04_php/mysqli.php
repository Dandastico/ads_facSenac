<?php

//mysqli é um metodo de acesso ao banco de dados MySql
$servername = "localhost";
$database = "php";
$username = "root";
$password = "senac";
//criar conexão
$conn = mysqli_connect($servername, $username, 
       $password, $database);
if(!$conn){
    die("Conexão falhou!". mysqli_connect_error());
}
echo "Deu bom...";
//queries
$sql = "INSERT INTO alunos(`nome`, `ultimo_nome`, `email`)
VALUES ('Ana', 'Souza', 'nanaclarasouza@gmail.com');";
//testar o insert
if(mysqli_query($conn, $sql)){
    echo "Registro criado com sucesso";
}else{
    echo"Error: ".$sql."<br>".mysqli_error($conn);
}
mysqli_close($conn);
