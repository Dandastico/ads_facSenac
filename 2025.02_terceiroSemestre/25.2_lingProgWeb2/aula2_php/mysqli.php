<?php
    $br = "<br><br>";

    $servername = "localhost";
    $database = "php";
    $username = "root";
    $password = "senac";

    //criar a conexão
    $conn = new mysqli($servername, $username, $password, $database);
    //checar conexão
    if (!$conn) {
        die("Conexão é biruleibe". mysqli_error($conn));
    }
    echo"Conexão vitoriosa!";

    echo $br;
    //inserir dados na tabela

    $sql = "INSERT INTO `php`.`alunos`(`nome`, `ultimo_nome`, `email`, `id_turma`)
VALUES ('filipe', 'delfino', 'muleque-lindo@teste.com', 1);";

    if (mysqli_query($conn, $sql)) {
        echo "Novo registro criado!";
    } else {
        echo"Error: ".$sql."<br>";
        mysqli_error($conn);
    }mysqli_close($conn);