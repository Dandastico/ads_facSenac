def main():
    frase = input("Digita uma frase: ").lower()
    palavra = input("Digite a palavra que você quer que seja encontrado na frase: ")

    print(f"\nA palavra \"{palavra}\" se repete {frase.count(palavra.lower())} vez(es) na frase.")


if __name__ == "__main__":
    main()