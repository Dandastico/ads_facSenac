# Exercício de Revisão 02
# Escreva um pequeno código python que simule o uso de um dicionário

def main():
    d = get_dict()
    find_average(d)


def get_dict():
    d = {}
    size = 5

    for _ in range(size):
        key = input("Nome: ")
        value = int(input("Nota: "))
        if key not in d:
            d.update({key: value})
        else:
            print("Aluno já foi inserido no banco de dados")    
    return d


def find_average(d):
    average = 0
    for key in d:
        average += d[key]
    average /= len(d)
    print(f"{average:.2f}")


if __name__ == "__main__":
    main()