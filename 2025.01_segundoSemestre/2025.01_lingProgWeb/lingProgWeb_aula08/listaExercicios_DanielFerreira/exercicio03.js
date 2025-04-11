// ver se carregou
console.log("JS 03 carregou!");


// função que foi invocada ao clicar em no input do tipo submit
function pingPong(event) {
    // impedir o envio pra algum servidor
    event.preventDefault();

    let less = parseInt(document.getElementById("start").value);
    console.log(less);

    let more = parseInt(document.getElementById("end").value);
    console.log(more);

    // montar substuinto os números necessários
    let numbers = []
    for (let i = less; i <= more; i++) {
        if ((i%3) == 0 && (i%5) == 0) {
            numbers.push("PingPong");
        } else if ((i%3) == 0) {
            numbers.push("Ping");
        } else if ((i%5) == 0) {
            numbers.push("Pong");
        } else {
            numbers.push(i);
        }
    }

    // montar a string
    let txt = '';
    function build_txt(value) {
        txt += value + "<br>";
    }
    numbers.forEach(build_txt);
    console.log(txt);

    // imprimir string em tela
    let resp = document.getElementById("resposta");
    resp.innerHTML = txt;
}