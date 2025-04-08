'''
Escrever um código python que baseado no valor da variável que armazene o
seu nome, quantifique a quantidade de vogais.
'''

def main():
    nome = input("Qual seu nome? ").lower()

    cont = contador_vogal(nome)

    if cont > 1:
        print(f"Seu nome contém {cont} vogais")
    else:
        print(f"Seu nome contém 1 vogal")


def contador_vogal(string):
    vogais = "aeiou"
    cont = 0

    for char in string:
        if char in vogais:
            cont += 1

    return cont


if __name__ == "__main__":
    main()