import sys

def main():
    altura = None
    for _ in range(3):
        try:
            altura = float(input("Digite a altura: "))
            break
        except:
            print("Digite números, seu doido")

    if altura is None:
        sys.exit("Desisti de tu, vaza")

    genero = int(input("\nQual teu gênero:\nDigite 1 para mulher\nDigite 2 para homem\n"))
    match genero:
        case 1:
            peso_h = f"{calcular_h(altura):.2f}"
            print(peso_h)
        case 2:
            peso_m = f"{calcular_m(altura):.2f}"
            print(peso_m)
        case _:
            print("Resposta inválido")


def calcular_h(a):
    return (72.7*a)-58


def calcular_m(a):
    return (62.1*a)-44.7


if __name__ == "__main__":
    main()