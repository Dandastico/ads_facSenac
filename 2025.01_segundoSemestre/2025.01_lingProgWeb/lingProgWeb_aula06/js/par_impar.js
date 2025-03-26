// avisar que carregou o js
console.log("JS foi carregado")

// criar função
function parImpar(event) {
    // impedir envio de dados para servidor
    event.preventDefault();

    const n = Number(document.getElementById("numero").value)
    console.log(n);

    let resultado = (n%2==0)? "Par":"Ímpar";

    const output = document.querySelector("h3")
    output.innerHTML = `${n} é um número ${resultado}`

}