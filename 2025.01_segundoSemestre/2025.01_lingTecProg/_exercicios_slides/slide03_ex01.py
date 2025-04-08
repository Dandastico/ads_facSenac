'''
Escrever um código python que baseado no valor da variável mês do tipo
numérico seja impresso o mês de modo extenso.
'''

def main():
    while True:
        try:
            mes = int(input("Digite valor número de 1 a 12: "))
            if not (0 < mes < 13): # usuário digitou número errado
                raise ValueError
        except ValueError:
            print("\nErro: só é aceito como input números de 1 a 12!\n")
        else:
            break # se deu tudo certo

    converter_mes(mes)


def converter_mes(n):
    meses = [
        "Janeiro",
        "Fevereiro",
        "Março",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro"
        ]

    print(meses[n-1])


if __name__ == "__main__":
    main()