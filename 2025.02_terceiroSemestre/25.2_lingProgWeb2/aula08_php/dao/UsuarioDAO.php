<?php
    class UsuarioDAO {
        public static function createUsuario(Usuario $usuario) : Returntype {

            try{
                $sql = "INSERT INTO usuario(nome, sobrenome, idade, sexo)
                    VALUES(:nome, :sobrenome, :idade, :sexo);";
                $p_sql = Conexao::getConexao()->prepare($sql);
                $p_sql->binValue(":nome", $usuario->getNome());
                $p_sql->bindValue(":sobrenome", $usuario->getSobrenome());
                $p_sql->bindValue(":idade", $usuario->getIdade());
                $p_sql->bindValue(":sexo", $usuario->getSexo());

                return $p_sql->execute();
            }catch(Exception $e) {
                print "Erro ao inserir um usuário: <br>".$e."<br>";
            }
        }
        public function readUsuario(Usuario $usuario) : void {
            try{
                $sql = "SELECT * FROM usuario ORDER BY ASC;";
                $result = Conexao::getConexao()->prepare($sql);
                $lista = $result->fetchAll(PDO::FETCH_ASSOC);
                $f_lista = array();
                foreach($lista as $l) {
                    $lista[] = $this-listaUsuario($l);
                } return $f_lista;

                return $p_sql->execute();
            }catch(Exception $e) {
                print "Erro ao inserir um usuário: <br>".$e."<br>";
            }
        }

        public function updateUsuario(Usuario $usuario) : void {
            try{
                $sql = "UPDATE usuario SET
                    nome=:nome, sobrenome=:sobrenome, idade=:idade, sexo=:sexo
                    WHERE id=:id;";
                $p_sql = Conexao::getConexao()->prepare($sql);
                $p_sql->binValue(":nome", $usuario->getNome());
                $p_sql->bindValue(":sobrenome", $usuario->getSobrenome());
                $p_sql->bindValue(":idade", $usuario->getIdade());
                $p_sql->bindValue(":sexo", $usuario->getSexo());
                $p_sql->bindValue(":id", $usuario->getId());

                return $p_sql->execute();
            }catch(Exception $e) {
                print "Erro ao atualizar usuário: <br>".$e."<br>";
            }
        }

        public function deleteUsuario(Usuario $usuario): void {
            try{
                $sql = "DELETE FROM usuario WHERE id=:id;";
                $p_sql = Conexao::getConexao()->prepare($sql);
                $p_sql->bindValue(":id", $usuario->getId());

                return $p_sql->execute();
            }catch(Exception $e){
                print "Erro ao deletar usuário: <br>".$e."<br>";
            }
        }
    }