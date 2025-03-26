// avisar pelo console que está funcionando
console.log("Carregou JS")

function calculateAverage(event) {
    // previne o envio do formulário as coisas estarem preenchidas
    event.preventDefault();

    const nota1 = parseFloat(document.getElementById("inNota1").value)
    const nota2 = parseFloat(document.getElementById("inNota2").value)

    // calcular media
    const media = (nota1 + nota2) / 2

    // determinar situação do aluno
    let situacao;
    if (media >= 6) {
        situacao = "Aprovado"
    } else if (media >= 2) {
        situacao = "Recuperação"
    } else {
        situacao = "Reprovado, boa sorte no próximo semestre"
    }

    // mostrar o resultado
    const resultadoSituacao = document.querySelector("h3")
    const resultadoMedia = document.querySelector("h4")
    resultadoSituacao.innerHTML = `Situação: ${situacao}`
    resultadoMedia.innerHTML = `Média: ${media.toFixed(2)}`
}


