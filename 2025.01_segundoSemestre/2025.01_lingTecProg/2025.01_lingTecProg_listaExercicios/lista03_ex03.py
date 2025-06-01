'''
Escreva um programa que solicite ao usuário uma string e retorne a string inversa, sem utilizar a função built-in [::-1]. Crie uma função que receba a string como parâmetro e retorne a string invertida.
'''

def main():
    s = input("Digite uma frase: ")
    s = inverter_str(s)
    print(s)


def inverter_str(s):
    palavras = s.split()
    return " ".join(reversed(palavras))


if __name__ == "__main__":
    main()