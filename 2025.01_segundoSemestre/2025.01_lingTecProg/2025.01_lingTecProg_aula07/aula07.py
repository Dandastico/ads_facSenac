# AULA 07 - MANIPULAÇÃO DE ARQUIVO
# abrir e fechar arquivo manualmente
arquivo = open("contatos.txt", 'w')
arquivo.write("Hello World!")
arquivo.close()


# abrir arquivo como se fosse laço de repetição, fecha automaticamente
with open("contatos2.txt", 'w', encoding="utf-8") as arquivo:
    arquivo.write("Olá, Daniel Ferreira, estudante lindíssimo")