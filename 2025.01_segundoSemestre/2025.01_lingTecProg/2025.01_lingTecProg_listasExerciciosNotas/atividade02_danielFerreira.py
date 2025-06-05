def main():
    nums = [0,3,7,8,9,10,23,43,123,333]
    primos = list(filter(validar_primo, nums))
    print(f"Os números primos são {primos}")


def validar_primo(n):
    # se for 1, 0 ou negativo, não é primo
    if n <= 1: return False
    # 2 é único único número par que é primo
    if n == 2: return True
    # qualquer outro par nao é primo
    if n % 2 == 0:  return False
    # dividr dividir o número apenas por números primos
    for i in range(3, int(n/2), 2):
        if n % i == 0: return False
    # sobreviveu ao loop, então é primo
    return True


if __name__ == "__main__":
    main()