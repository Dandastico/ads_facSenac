const nomes = ["fAbio", "Emilia", "dAniel", "CarOlina", "BrUno", "Ana"];

function filtrarNomes(nomes) {
    // map() altera itera sobre matriz e retorna-os
    // filter() retira elementos que não passam pelo teste da condicional
    // sort() ordena alfabeticamente a matriz
    let maiusculas = nomes.map(nome => nome.toUpperCase()).filter(nome => nome.length > 5).sort();
    
    maiusculas.forEach(nome => {
        console.log(`${nome} tem ${nome.length} letras`);
    });
}

filtrarNomes(nomes);