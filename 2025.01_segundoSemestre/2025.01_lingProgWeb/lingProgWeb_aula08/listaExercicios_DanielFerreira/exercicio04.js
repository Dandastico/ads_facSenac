console.log("JS 04 carregou!")

// inicializar variáveis
let fila = [];
let resp = document.getElementById("resposta");
resp.innerHTML = "Fila vazia";


// criar funções que introduz nome digitado no array de clientes
function entrarFila() {
    console.log("Função entrarFila ativada!")

    // inicializar variáveis
    let nome = document.getElementById("txt").value;
    console.log(nome);

    // só adiciona nome e imprime array se usuário digitou algo
    if (nome) {
        fila.push(nome);

        // limpar input
        document.getElementById("txt").value = '';

        // mostrar fila na tela
        resp.innerHTML = fila.join(", ");
    }
}


// criar função que retira o primeiro nome do array de clientes
function  sairFila() {
    console.log("Função sairFila ativada!");

    // retira primeiro nome apenas se array tiver pelo menos um elemento
    if (fila.length > 0){
        fila.shift();
        console.log(fila);

        // atualizar exibição da fila
        if (fila.length > 0) {
            resp.innerHTML = fila.join(", ");
        } else {
            resp.innerHTML = "Fila vazia";
        }
    }
}




// vou criar os observadores de eventos para cada botão
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById("entrar").addEventListener("click", entrarFila);
    document.getElementById("atender").addEventListener("click", sairFila);
});