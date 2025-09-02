<?php
include("Conexao.php");

//capturar os dadoos que venham de um form
$nome = $_POST["nome"];
$senha = $_POST["senha"];
$email = $_POST["email"];
$cpf = $_POST["cpf"];
$data = $_POST["data"];

//comando para insert
$sql = "INSERT INTO (`nome`, `senha`, `email`, `cpf`, `data`);
VALUES($nome , $senha ,$email ,$cpf ,$data )";

//debug - apresentar a conexao
echo"<pre>$sql</pre>";
//executar
if ($conn->query($sql) === TRUE) {
    echo "<script>alert(`Cadastro efetuado com sucesso`);</script>";
    echo "<script>location.href='cadastrar.html';</script>";
} else {
    //exibir os erros
    echo"<script>alert('Erro ao cadatrar.Erro:". $conn->error."');</script>";

}
$conn->close();