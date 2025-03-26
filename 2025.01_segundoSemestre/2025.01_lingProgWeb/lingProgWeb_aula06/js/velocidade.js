// avisar que carregou o js
console.log("JS foi carregado")

// criar função
function checagem(event) {
    // impedir envio de dados para servidor
    event.preventDefault();

    // criaçao de constante da velocidade máxima
    const velMaxima = Number(document.getElementById("velPermitida").value)
    console.log(velMaxima);

    // criação da constante da velocidade registrada
    const vel = Number(document.getElementById("velRegistrada").value)
    console.log(vel)

    // cálculo pra verificar se é multa grave ou leve
    let multa;
    if (vel > velMaxima) {
        // se velocidade não ultrapassar a 120% da máxima
        if (vel <= velMaxima * 1.2) {
            multa = "Multa Leve"
        } else {
            multa = "Multa Grave"
        }
    } else {
        multa = "Sem Multa"
    }

    const output = document.querySelector("h3")
    output.innerHTML = `${multa}`

}