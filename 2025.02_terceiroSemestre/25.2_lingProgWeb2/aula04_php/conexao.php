<?php
define("HOST","localhost"); 
define("USER","root");
define("PAS","senac");
define("PORT","3306");
define("BASE","cadastro");

// criação da conexão mySQLi

$conn = new mysqli(HOST, USER, PAS, BASE, PORT);
//Testar conexão
if(!$conn) {
    die("Falha na conexão".$conn->connect_error);
}else{
    echo "conexão bem sucedida!";
}

