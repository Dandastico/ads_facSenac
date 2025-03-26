// avisar que carregou o js
console.log("JS foi carregado")

// criar função
function checagem(event) {
    // impedir envio de dados para servidor
    event.preventDefault();

    // obter os valores do formulário
    const aresta1 = Number(document.getElementById("aresta1").value);
    console.log(aresta1);

    const aresta2 = Number(document.getElementById("aresta2").value);
    console.log(aresta2);

    const aresta3 = Number(document.getElementById("aresta3").value);
    console.log(aresta3);

    // soma das arestas
    const soma12 = aresta1 + aresta2;
    const soma13 = aresta1 + aresta3;
    const soma23 = aresta2 + aresta3;

    // verificação se triângulo é possível
    let triangulo;
    if (soma12<aresta3 || soma13<aresta2 || soma23<aresta1) {
        triangulo = "Não é possível formar um triângulo"
    } else {
        if (aresta1==aresta2 && aresta1==aresta3) {
            triangulo = "Triângulo Equilátero"
        } else if (aresta1==aresta2 || aresta1==aresta3 || aresta2==aresta3) {
            triangulo = "Triângulo Isóceles"
        } else {
            triangulo = "Triângulo Escaleno"
        }
    }

    // output
    const output = document.querySelector("h3");
    output.innerHTML = `${triangulo}`
}