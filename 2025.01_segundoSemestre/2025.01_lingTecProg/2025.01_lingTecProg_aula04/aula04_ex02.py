def main():
    x = float(input("Digite valor de x: "))
    y = float(input("Digite valor de y: "))

    operacao = input("Digite operação desejada: ").lower()
    print(calculo(x, y, operacao))


def calculo(x, y, operacao):
    sinais = ["+", "-", "*", "/"]
    for sinal in sinais:
        if sinal == operacao and sinal == "+":
            return x + y
        elif sinal == operacao and sinal == "-":
            return x - y
        elif sinal == operacao and sinal == "*":
            return x * y
        elif sinal == operacao and sinal == "/":
            return x / y
            

main()