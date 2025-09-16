<?php
    include('../conexao/Conexao.php');
    $sql = "SELECT * FROM usuario";
    $result = $conn->query($sql);
    while ($usuario = $result->FETCH_ASSOC()) {
        echo "Nome: ".$usuario['nome']."- Sobrenome".$usuario['sobrenome']."<br>";
    }