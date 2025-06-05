def main():
    frase, palavra = pedir_input()
    quant = frase.count(palavra)
    print(f"{palavra.capitalize()} aparece {quant} vez(es) na frase")


def pedir_input():
    frase = input("Digite a frase: ").lower()
    palavra = input("Digite uma palavra: ").lower()
    return frase, palavra


if __name__ == "__main__":
    main()