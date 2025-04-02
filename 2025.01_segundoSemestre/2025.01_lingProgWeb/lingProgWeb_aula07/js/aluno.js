// ver se JS funcionou
console.log("JS carregou")

function Aluno(nome, disciplina, frequencia,nota1, nota2) {
    this.nome = nome,
    this.disciplina = disciplina,
    this.frequencia = frequencia,
    this.nota1 = nota1,
    this.nota2 = nota2
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
}