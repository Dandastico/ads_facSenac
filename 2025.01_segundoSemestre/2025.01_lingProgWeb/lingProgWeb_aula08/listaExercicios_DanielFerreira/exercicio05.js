console.log("JS 05 carregou!")

// função que converte segundos para HH:MM:SS
function converter(event) {
    // impedir de enviar dados para um servidor
    event.preventDefault();

    console.log("converter foi ativada!")

    let segundos = parseInt(document.getElementById("segundos").value);

    // caucular hora, minuto e segundos
    h = parseInt(segundos/60/60);
    console.log(h);

    m = parseInt((segundos/60) % 60);
    console.log(m);

    s = parseInt(segundos % 60);
    console.log(s);

    // montar o texto de visualização
    let strHoras;
    let strMinutos;
    let strSegundos;

    if (h > 1) {
        strHoras = `${h} horas`;
    } else {
        strHoras = `${h} hora`;
    }

    if (m > 1) {
        strMinutos = `${m} minutos`;
    } else {
        strMinutos = `${m} minuto`;
    }

    if (s > 1) {
        strSegundos = `${s} segundos`;
    } else {
        strSegundos = `${s} segundo`;
    }

    let strHorario = strHoras + ", " + strMinutos + " e " + strSegundos;

    // mostrar pro usuário
    let resp = document.getElementById("resposta");
    resp.innerHTML = strHorario;
}