from libAula import converterValor

def main():
    while True:
        try:
            real = float(input("Valor em real: "))
            cotacao = float(input("Cotação de real para dólar: "))
            break
        except ValueError:
            print("Valores inválidos, tente novamente.")

    dolar, data = converterValor(real, cotacao)
    print(dolar)
    print(data)


main()