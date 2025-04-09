// função que imprime na ordem ascendente
function asc(start, end) {
    let less = parseInt(start.value);
    let more = parseInt(end.value);

    let numbers = []
    for (let i = less; i <= more; i++) {
        numbers.push(i);
    }

    // pra cada elemento no array, imprima no HTML
    let txt = '';
    function render(value) {
        txt += value + ' '
    }
    
    numbers.forEach(render);

    let resp = document.getElementById("resposta");
    resp.innerHTML = txt
}