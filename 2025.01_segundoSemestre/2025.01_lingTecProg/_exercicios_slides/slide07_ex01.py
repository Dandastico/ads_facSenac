'''
1º Faça um Programa que leia um vetor de 5
números inteiros e mostre-os.
'''

numeros = []

for i in range(5):
    numeros.append(int(input(f"Digite {i+1}º número: ")))

for n in numeros:
    print(n)


'''
Faça um Programa que leia um vetor de 10
caracteres, e diga quantas consoantes foram lidas.
Imprima as consoantes.
'''

chars = []

print("Digite 10 caracteres")

for i in range(10):
    chars.append(input(f"{i+1}º caractere: ").lower())

vogais = "aeiou"
cont_v = 0

for char in chars:
    if char in vogais:
        cont_v += 1

print(f"{cont_v} vogais foram digitados")