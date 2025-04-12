console.log("JS 04 carregou!")

// inicializar variáveis
let fila = [];
let resp = document.getElementById("resposta");


// criar funções que introduz nome digitado no array de clientes
function entrarFila() {
    console.log("Função entrarFila ativada!")

    // inicializar variáveis
    let nome = document.getElementById("txt").value;
    console.log(nome);

    // adicionar nome na última posição do array
    fila.push(nome);

    // mostrar fila na tela
    resp.innerHTML = fila;
}


// criar função que retira o primeiro nome do array de clientes
function  sairFila(fila) {
    comnsole.log("Função sairFila ativada!");

    // retirar primeiro nome do array
    fila.shift();
    console.log(fila);
}




// vou criar os observadores de eventos para cada botão
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById("entrar").addEventListener("click", entrarFila);
    document.getElementById("atender").addEventListener("click", sairFila);
});