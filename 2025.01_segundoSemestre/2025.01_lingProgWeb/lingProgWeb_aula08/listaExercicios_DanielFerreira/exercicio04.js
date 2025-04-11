console.log("JS 04 carregou!")


// criar funções que introduz nome digitado no array de clientes
function entrarFila() {
    console.log("Função entrarFila ativada!")

    // inicializar variáveis
    let fila = [];
    let nome = document.getElementById("txt").value;
    console.log(nome);

}




// vou criar os observadores de eventos para cada botão
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById("entrar").addEventListener("click", entrarFila);
    document.getElementById("atender").addEventListener("click", sairFila);
});