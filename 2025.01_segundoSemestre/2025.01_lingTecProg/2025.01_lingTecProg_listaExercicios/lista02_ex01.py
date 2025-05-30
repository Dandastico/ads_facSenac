'''
1 - Escreva um programa que solicite ao usuário um número inteiro e verifique se esse número é primo. Caso seja, imprima uma mensagem informando que o número é primo. Caso contrário, imprima uma mensagem informando que o número não é primo.
'''

import sys

def main():
    try:
        n = int(input("Digite um número inteiro: "))
    except:
        sys.exit("Só é aceito número inteiro por aqui, forasteiro!")

    if not primo(n):
        sys.exit(f"{n} não é um número primo")
     
    print(f"{n} é um número primo")
    

def primo(n):
    if n == 1:
        return False
    
    if n == 2:
        return True

    if n % 2 == 0:
        return False
    
    # já chequei 0, 1 e 2 anteriormente, então começa range com 3
    for i in range(3, n):
        if n % i == 0:
            return False
    # sobreviveu até aqui, retorne verdadeiro
    return True


if __name__ == "__main__":
    main()