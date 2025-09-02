<?php
    $host = "localhost";
    $username = "root";
    $password = "senac";
    $dbname = "php";

    try {
        $pdo = new PDO("mysql:host=$host;$dbname", $username, $password);
        $pdo ->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        echo "Conexão bem sucedida";
    } catch(PDOException $e) {
        die("erro na conexão ").$e->getMessage();
    }