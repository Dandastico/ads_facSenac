'''
Faça um programa que peça as 4 notas bimestrais
e mostre a média
'''

def main():
    grades = get_grades()

    if grades is None:
        print("\nNão foi possível calcular a média\n")
    else:
        # calcular média
        media = calc_media(grades)

        # gerar arquivo
        gerar_arquivo(media)
        
        

# função que recebe do usuário as 4 notas
def get_grades():

    # três tentativas pra pessoa escrever certo
    for i in range(3):
        try:
            grades = []
            for i in range(4):
                grades.append(float(input(f"{i+1}ª nota: ")))
                if grades[i] < 0:
                    raise ValueError("Nota não pode ser negativa!")
            # retorna a lista se tudo tiver dado certo
            return grades
        except ValueError as e:
            print(f"\nErro: {e}\nTente novamente")
    # tentou 3 vezes e deu ruim, retorne None
    return None


# calcula a média
def calc_media(grades):
    sum = 0
    for grade in grades:
        sum += grade

    # retorne valor da soma dividido pela quantidade de elementos somados
    return sum / len(grades)


# gravar no disco a média em um arquivo txt
def gerar_arquivo(media):
    string = f"A média do aluno é {media:.2f}"

    with open("slide09_ex01.txt", 'w', encoding="utf8") as f:
        f.write(string)


if __name__ == "__main__":
    main()