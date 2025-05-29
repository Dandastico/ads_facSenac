import random
import sys

def main():
    try:
        quant = int(input("Quantos números devem ser gerados: "))
    except:
        sys.exit("ERRO: só aceito números, bobão")

    nums = gerar_lista(quant)

    # calcular média dos valores da lista
    media = calc_media(nums, quant)
    print(f"Média dos valores gerados: {media}")

    # imprimir valor máximo e mínimo
    print(f"Valor mínimo gerado: {min(nums)}")
    print(f"Valor máximo gerado: {max(nums)}")


def gerar_lista(quant):
    nums = []
    for _ in range(quant):
        nums.append(random.randint(1, 100))
        print(nums[-1])
    return nums


def calc_media(nums, quant):
    return (sum(nums) / quant)


if __name__ == "__main__":
    main()

