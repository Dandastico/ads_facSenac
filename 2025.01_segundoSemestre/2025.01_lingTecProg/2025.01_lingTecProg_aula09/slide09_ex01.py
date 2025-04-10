'''
Faça um programa que peça as 4 notas bimestrais
e mostre a média
'''

def main():
    grades = get_grades()

    media = calc_media(grades)
    string = f"A média do aluno é {media:.2f}"

    with open("media.txt", 'w') as file:
        file.write("string")
        


# função que recebe do usuário as 4 notas
def get_grades():
    grades = []
    while True:
        try:
            for i in range(4):
                grades.append(float(input(f"{i+1}ª nota: ")))
        except ValueError:
            print("\nErro: nota deve ser numérico!\nTente novamente")
        else:
            break
    return grades


def calc_media(grades):
    sum = 0
    for grade in grades:
        sum += grade

    # retorne valor da soma dividido pela quantidade de elementos somados
    return sum / len(grades)

if __name__ == "__main__":
    main()