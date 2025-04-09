
// impressão dos números de 1 a 100 utilizando laço for

// primeiro vou preparar a string
let resp = "";
for (let i = 1; i <= 100; i++) {
    resp += i + "<br />";
}

const impressao = document.getElementById("resposta");
impressao.innerHTML = resp;