'''
Elabore um código python que realize as operações básicas da matemática
(soma, subtração, divisão e multiplicação) em uma única função.
'''

def main():
    x, op, y = ipt_equacao()

    print(f"Valor: {calculadora(x, op, y)}")


# pede input do usuário e prepara os valores
def ipt_equacao():
    while True:
        equacao = input("Digite operação matemática com dois números reais: ").strip()

        operacoes = ['+', '-', '/', '*']

        x, op, y = equacao.split()

        try:
            x, y = float(x), float(y)
        except ValueError:
            print("\nErro: 'x' e 'y' devem ser números reais")
        
        if op not in operacoes:
            print("\nErro: Operador matemático inválido")
            continue

        if op == '/' and y == 0:
            print("\nErro: não é possível dividir um número por 0")
            continue
        
        return x, op, y


# calcula a equação digitada pelo usuário
def calculadora(x, op, y):
    match op:
        case '+':
            return x + y
        case '-':
            return x - y
        case '*':
            return x * y
        case '/':
            return x / y


if __name__ == "__main__":
    main()