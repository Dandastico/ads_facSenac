'''
Escreva um programa que solicite ao usuário uma frase e uma palavra, e então crie um dicionário onde as chaves são as palavras únicas presentes na frase e os valores são a quantidade de vezes que cada palavra aparece na frase. Imprima o dicionário resultante.
'''

def main():
    s = input("Digite uma frase: ")
    palavras = separar_palavras(s)
    contagem = contar_palavras(palavras)

    print(contagem)


def separar_palavras(s):
    palavras = s.lower().split()
    palavras_tratadas = []
    pontuacao = ['.', ',', '!', '?']

    for palavra in palavras:
        if palavra[-1] in pontuacao:
            palavras_tratadas.append(palavra.strip(palavra[-1]))
            continue
        palavras_tratadas.append(palavra)

    return palavras_tratadas


def contar_palavras(palavras):
    contagem = {}
    
    for palavra in palavras:
        if palavra in contagem:
            contagem[palavra] += 1
            continue
        contagem[palavra] = 1

    return contagem


if __name__ == "__main__":
    main()