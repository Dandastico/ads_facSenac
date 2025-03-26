'''
teste pra ver como "try" funciona
while True:
    try:
        nota1 = float(input("Nota: "))
        break
    except ValueError:
        print("Só aceito número, doidão")
'''

print("Aula 03")
import libAula as lib # importa o arquivo com apelido lib
# para importar apenas função desejada: from libAula import contarVogal


def main():
    nome = input("Digite nome: ").lower()
    cont = lib.contarVogal(nome)
    print(cont)


# invocar main() para rodar o programa
main()