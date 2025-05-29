import sys

def main():
    f = obter_temperatura()
    if f is None:
        sys.exit("Aff, desisti de você, sinceramente")
    
    c = calc_celsius(f)
    print(f"A teperatura está em {c:.2f}ºC")


def obter_temperatura():
    f = None
    for _ in range(3):
        try:
            f = float(input("Digite a temperatura em grau Fahrenheit: "))
            if f < 0:
                print("Fahrenheit não pode ser negativo")
                continue
        except ValueError:
            print("Precisa digitar número, doidão")
        else:
            break
    return f


def calc_celsius(f):
    return (5*((f-32)/9)) 


if __name__ == "__main__":
    main()