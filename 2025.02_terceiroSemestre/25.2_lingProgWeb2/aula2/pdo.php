<?php

    $servername = "localhost";
    $database = "php";
    $username = "root";
    $password = "senac";

    $sql = "mysql:host=$servername;dbname=$database";
    $dsn_option = [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION];

    // criando nova conexão
    try {
        $myDbConnection = new PDO($sql, $username, $password, $dsn_option);
        echo"Deu tudo certo";
    } catch (PDOException $e) {
        echo "Deu ruim".$e->getMessage();
    }

    $first_name = "Daniel";
    $last_name = "Ferreira";
    $email = "daniel@ferreira.com";

    $my_Insert_Statement -> bindParam(':first_name', $first_name);
    $my_Insert_Statement -> bindParam(':last_name', $last_name);
    $my_Insert_Statement -> bindParam(':email', $email);

    if ($my_Insert_Statement -> execute()) {
        echo 'Novo registro criado!';
    } else {
        echo "Deu ruim na criação do resgistro";
    }