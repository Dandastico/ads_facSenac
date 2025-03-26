def contarVogal(nome):
    vogais = "aeiou"
    cont = 0
    for i in nome:
        if i in vogais:
            cont += 1
    # retorna contagem de vogais pro main()
    return cont


def converterValor(real, cotacao):
    dolar = round(real / cotacao, 2)
    return dolar, "06/03/2025"