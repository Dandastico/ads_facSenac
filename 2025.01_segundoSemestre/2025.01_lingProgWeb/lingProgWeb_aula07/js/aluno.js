// ver se JS funcionou
console.log("JS carregou")

// criação da classe do objeto
function Aluno(nome, disciplina, frequencia,nota1, nota2) {
    this.nome = nome;
    this.disciplina = disciplina;
    this.frequencia = frequencia;
    this.nota1 = nota1;
    this.nota2 = nota2
    this.media = (nota1/nota2) / 2 // calculo da média
}

function calcularMedia(event){
    // impedir envio de dados pro servidor
    event.preventDefault();

    // pegar nome do formulário
    const nome = document.getElementById("nome").value
    console.log(nome)

    // pegar disciplina
    const disciplina = document.getElementById("disciplina").value
    console.log(disciplina)

    // pegar porcentagem de frequência
    const frequencia = document.getElementById("frequencia").value
    console.log(frequencia)

    // pegar notas do formulário
    const nota1 = Number(document.getElementById("nota1").value)
    console.log(nota1)

    const nota2 = Number(document.getElementById("nota2").value)
    console.log(nota2)

    const aluno = new Aluno(nome, disciplina, frequencia, nota1, nota2);

    let situacao;
    if (frequencia >= 75) {
        if (media >= 6) {
            situacao = "Aprovado"
        } else if (media >= 2) {
            situacao = "Recuperação"
        } else {
            situacao = "Reprovado"
        }
    } else {
        situacao = "Reprovado por falta"
    }
}