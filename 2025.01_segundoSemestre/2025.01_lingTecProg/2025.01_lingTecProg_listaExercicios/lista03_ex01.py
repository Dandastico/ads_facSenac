import random

def main():
    nums = gerar_lista()
    primos = list(filter(filtrar_nums, nums))

    print(nums)
    print(primos)


# gera lista com 10 números aleatórios de 1 a 20
def gerar_lista():
    nums = []
    for _ in range(10):
        nums.append(random.randint(0, 20))
    return nums


def filtrar_nums(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, n//2):
        if n % i == 0: return False
    return True


if __name__ == "__main__":
    main()