import sys

def main():
    s = input("Digite string: ")
    if not palindromo(s):
        sys.exit("Não é palíndromo!")
    print(f"{s} é um palíndromo.")


def palindromo(s):
    if s == s[::-1]:
        return True
    return False


if __name__ == "__main__":
    main()