// quero ver se js está carregando
console.log("JS carregou!")


// função que imprime na ordem ascendente
function asc() {
    // teste pra ver se foi invocada corretamente
    console.log("Função ativada")

    let less = parseInt(document.getElementById("start").value);
    let more = parseInt(document.getElementById("end").value);

    // montar o array em ordem crescente
    let numbers = []
    for (let i = less; i <= more; i++) {
        numbers.push(i);
    }

    // montar a string que será impressa
    let txt = '';
    function build_txt(value) {
        txt += value + ' '
    }
    numbers.forEach(build_txt);

    // demonstrar string no HTML
    let resp = document.getElementById("resposta");
    resp.innerHTML = txt;
}


// função que vai imprimir em ordem decrescente
function desc() {
    // teste pra ver se foi invocada corretamente
    console.log("Funcão desc foi invocada!")

    let less = parseInt(document.getElementById("start").value);
    let more = parseInt(document.getElementById("end").value);

    // montar o array em ordem decrescente
    let numbers = []
    for (let i = more; i >= less; i--) {
        numbers.push(i);
    }

    // montar a string que será impressa
    let txt = ''
    function build_txt(value) {
        txt += value + ' ';
    }
    numbers.forEach(build_txt);

    // demonstrar string no HTML
    let resp = document.getElementById("resposta");
    resp.innerHTML = txt;
}


// cria escutadores de eventos pro botões HTML e os vincula à funções
document.addEventListener('DOMContentLoaded', function() {
    // ao clicar no botão com id específica, rode a função correspondente
    document.getElementById('asc').addEventListener('click', asc);
    document.getElementById('desc').addEventListener('click', desc);
});