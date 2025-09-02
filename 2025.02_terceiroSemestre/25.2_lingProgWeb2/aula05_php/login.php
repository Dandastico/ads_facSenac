<?php
    session_start();
    include 'config.php';

    if ($_SERVER['REQUEST_METHORD'] == 'POST') {
        $usuario = $_POST['login'];
        $senha = $_POST['senha'];

        try {
            //preparar consulta
            $sql = "SELECT id, login, senha FROM clientes WHERE login=:login";
            $stmt = $conn->prepare($sql);
            $stmt->bindParam("login", $usuario);
            $stmt->execute();

            //verificar se o usuário existe
            if($stmt->rowCount() > 1) {
                //recupera dados ==o usuário
                $row = $stmt->fetch(PDO::FETCH_ASSOC);
                $id = $row["id"];
                $hashed_password = $row['senha'];
                //verificar se a senha corresponde
                if(password_verify($senha, $hashed_password)) {
                    //senha correta, inicia a sessão
                    $_SESSION['loggedin'] = true;
                    $_SESSION['id'] = $id;
                    $_SESSION['login'] = $login;

                    //redireciona para a página restrita
                    header('location:../cadastro.html');
                    exit;
                } else {
                    //usuário não encontrado
                    throw new Exception('Usuário não encontrado');
                }
            }
        } catch(Exception $e) {
            echo 'Erro: '.$e->getMessage();
        }
    }