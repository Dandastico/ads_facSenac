from util import calculaDesconto


def main():
    valor = 100
    perc_desconto = "10%" # desconto em porcentagem

    desconto = calculaDesconto(valor, perc_desconto)
    print(f"R$ {(valor-desconto):.2f}")


if __name__ == "__main__":
    main()