# AULA 07 - MANIPULAÇÃO DE ARQUIVO
# abrir e fechar arquivo manualmente
arquivo = open("contatos.txt", 'w')
arquivo.write("Hello World!")
arquivo.close()

# abrir arquivo como se fosse laço de repetição, fecha automaticamente
with open("contatos2.txt", 'w', encoding="utf-8") as arquivo:
    arquivo.write("Olá, Daniel Ferreira, estudante lindíssimo")


# o modo 'w' sobrescreve o arquive, para adicionar use o modo 'a' (append)
with open("contatos.txt", 'a', encoding="utf8") as arquivo:
    arquivo.write(f"\nOlá Jordan")

# usando writelines, método do descritor que escreve lista
with open("contatos3.txt", 'a', encoding="utf8") as arquivo:
    frases = []
    frases.append("Python\n")
    frases.append("TreinaWeb\n")
    frases.append("Django\n")
    frases.append("Arquivos")
    arquivo.writelines(frases)

# teste para ver se writelines funciona com dicionários
with open("contatos4.txt", 'a', encoding="utf8") as arquivo:
    d = {'1': "Daniel", '2': "Jordan"}
    arquivo.writelines(d) # salvou apenas as chaves, precisaram ser strings

# teste para armazenar o dicionário como JSON
with open("contatos5.txt", 'w', encoding="utf8") as arquivo:
    d = {1: "Daniel", 2: "Jordan"}
    arquivo.write(str(d))

'''
# testar se modo de escrita com binário permite escrita de int
with open("contatos5.txt", 'ba') as arquivo:
    d = {1: "Daniel", 2: "Jordan"}
    arquivo.writelines(d) 
# não funcionou, parece que realmente preciso transformar ints em strings
'''