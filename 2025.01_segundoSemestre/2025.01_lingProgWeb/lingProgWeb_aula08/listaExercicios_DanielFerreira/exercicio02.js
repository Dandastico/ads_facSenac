// função que imprime na ordem ascendente
function asc(start, end) {
    let less = parseInt(start.value);
    let more = parteInt(start.value);

    let numbers = []
    for (let i = less; i <= more; i++) {
        numbers.push(i);
    }

    // pra cada elemento no array, imprima no HTML
    numbers.forEach(render);

    let txt = '';
    function render(value) {
        txt += value = ' '
    }

    let resp = document.getElementById("resposta");
    resp.innerHTML = txt
}