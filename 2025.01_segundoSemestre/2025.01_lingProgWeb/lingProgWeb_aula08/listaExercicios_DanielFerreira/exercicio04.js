console.log("JS 04 carregou!")


// inicializar fila como variável global
let fila = [];


// criar funções que introduz nome digitado no array de clientes
function entrarFila() {
    console.log("Função entrarFila ativada!")

    // inicializar variáveis
    let nome = document.getElementById("txt").value;
    console.log(nome);

    // adicionar nome na última posição do array
    fila.push(nome);
    return fila
}

// mostrar fila na tela
let resp = document.getElementById("resposta");
resp.innerHTML = fila;


// vou criar os observadores de eventos para cada botão
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById("entrar").addEventListener("click", entrarFila);
    document.getElementById("atender").addEventListener("click", sairFila);
});