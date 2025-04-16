// pequena lista de exercícios
function verificarPar (n) {
    if (n%2 === 0) {
        return "par";
    } else {
        return "impar"
    }
}

// arrow function
const verificarPar = (n) => (n%2===0) ? "par" : "ímpar";