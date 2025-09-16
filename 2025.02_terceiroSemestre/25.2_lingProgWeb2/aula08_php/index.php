<?php
    include('conexao/Conexao.php');
    include('model/Usuario.php');
    include('dao/UsuarioDAO.php');
    include('controller/UsuarioController.php');

    //operador ternário - pegar a ação da URL
    $action = isset($_GET['action']) ? $_GET['action'] : 'index';

    //instanciar o controlador
    $usuarioController = new UsuarioController();

    //Executar a ação
    switch($action) {
        case "cadastrar":
            $usuarioController->cadastrar();
            break;
        case "editar":
            $usuarioController->editar();
            break;
        case "deletar":
            $usuarioController->deletar();
            break;
        default:
            $usuarioController->index();
            break;
    }