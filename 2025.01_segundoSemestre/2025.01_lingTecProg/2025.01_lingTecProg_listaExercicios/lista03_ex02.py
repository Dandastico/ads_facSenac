'''
Crie um programa que leia uma matriz 3x3 de números inteiros e calcule a soma de todos os elementos da diagonal principal e da diagonal secundária. Imprima os resultados.
'''

def main():
    matriz = [
        [6, 5, 1],
        [8, 7, 9],
        [3, 7, 4]
    ]
    
    soma_diagonal_principal = calc_diag_principal(matriz)
    soma_diagonal_secundaria = calc_diag_secundaria(matriz)

    print(soma_diagonal_principal)
    print(soma_diagonal_secundaria)


def calc_diag_principal(m):
    soma = 0
    for i in range(len(m)):
        for j in range(len(m[i])):
            if i == j: soma += m[i][j]
    return soma


def calc_diag_secundaria(m):
    soma = 0
    for i in range(len(m)):
        for j in range(len(m)):
            if i + j == (len(m)-1): soma += m[i][j]
    return soma


if __name__ ==  "__main__":
    main()