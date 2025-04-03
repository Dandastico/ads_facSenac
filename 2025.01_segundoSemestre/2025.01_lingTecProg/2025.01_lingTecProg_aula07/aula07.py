arquivo = open("contatos.txt", 'w')
arquivo.write("Hello World!")
arquivo.close()

with open("contatos2.txt", 'w') as arquivo:
    arquivo.write("Hellow World, my old friend!")