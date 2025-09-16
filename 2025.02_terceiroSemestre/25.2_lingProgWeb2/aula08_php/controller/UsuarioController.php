<?php
    include("../conexao/Conexao.php");
    include("../model/Usuario.php");
    include("../dao/UsuarioDAO.php");

    class UsuarioController{
        //metodo para cadastrar user
        public function cadastrar() : void{
            $d = filter_input_array(INPUT_POST);
            if(isset($d['cadastrar'])) {
                $usuario = new Usuario();
                $usuariodao = new UsuarioDAO();

                //atribui dados ao objeto instanciado
                $usuario->setNome($d['nome']);
                $usuario->setSobrenome($d['sobrenome']);
                $usuario->setIdade($d['idade']);
                $usuario->setSexp($d['sexo']);

                //inserção no banco de dados
                $usuariodao->createUsuario($usuario);

                //redirecionar
                header("Location:../../index.php?action=index");
                exit;
            }else{
                error_log("Não foi possível cadastrar o usuário");
            }
        }

        public function editar() : void{
            $d = filter_input_array(INPUT_POST);
            if(isset($d['editar'])) {
                $usuario = new Usuario();
                $usuariodao = new UsuarioDAO();

                //atribui dados ao objeto instanciado
                $usuario->setNome($d['nome']);
                $usuario->setSobrenome($d['sobrenome']);
                $usuario->setIdade($d['idade']);
                $usuario->setSexp($d['sexo']);
                $usuario->setId($d['id']);

                //inserção no banco de dados
                $usuariodao->updateUsuario($usuario);

                //redirecionar
                header("Location:../../index.php?action=index");
                exit;
            }else{
                error_log("Não foi possível atualziar o usuário");
            }
        }

        public function deletar() : void {
            $d = filter_input_array(INPUT_POST);
            if(isset($d['deletar'])) {
                $usuario = new Usuario();
                $usuariodao = new UsuarioDAO();
                $usuario->setId($d['id']);

                //deletar usuario no banco de dados
                $usuariodao->deleteUsuario($usuario);
            }else{
                error_log("Nçao foi possível deletar o usuário");
            }
        }

        public function index() : void {
            include('../view/usuarioList.php'); // exibe a lista de usuário
        }
    }