'''
Elabore um código python que realize as operações básicas? Soma, subtração,
multiplicação e divisão em formato de funções.

Obs: As funções devem receber 2 parâmetros.
'''

def main():
    print("---- CALCULADORA ----\n")
    
    x, operacao, y = converter_equacao()

    match operacao:
        case '+':
            soma(x, y)
        case '-':
            subtracao(x, y)
        case '*':
            multi(x, y)
        case '/':
            div(x, y)


# função que prepara o input do usuário pras operações
def converter_equacao():
    while True:
        equacao = input("Digite a operação desejada com dois números inteiros: ")
        operacoes = ['+', '-', '*', '/']
        x, operacao, y = equacao.split()

        try:
            x, y = float(x), float(y)
        except ValueError:
            print("\nErro: x e y devem ser números reais")
        
        if operacao not in operacoes:
            print("\nErro: só são as operaçãos '+', '-', '*' e '/'")
            continue
        elif operacao == '/' and y == 0:
            print("\nErro: Não é possível dividir um número por 0")
            continue
        
        return x, operacao, y


# sequência das funções que realizam as operações
def soma(x, y):
    print(f"Resultado: {x + y}")

def subtracao(x, y):
    print(f"Resultado: {x - y}")

def multi(x, y):
    print(f"Resultado: {x * y}")

def div(x, y):
    print(f"Resultado: {x / y}")


if __name__ == "__main__":
    main()