'''
 Crie um programa que gere uma lista de números aleatórios entre 1 e 1000 (inclusive) e retorne uma nova lista contendo apenas os números pares e outra lista contendo apenas os números ímpares. Utilize uma função para separar os números em pares e ímpares.
'''

import random

def main():
    nums = gerar_lista()
    pares, impares = separar_numeros(nums)

    print(nums)
    print(pares)
    print(impares)


def gerar_lista():
    nums = []
    for _ in range(10):
        nums.append(random.randint(1, 1000))
    return nums


def separar_numeros(nums):
    pares = []
    impares= []
    for n in nums:
        pares.append(n) if n%2==0 else impares.append(n)
    return pares, impares


if __name__ == "__main__":
    main()