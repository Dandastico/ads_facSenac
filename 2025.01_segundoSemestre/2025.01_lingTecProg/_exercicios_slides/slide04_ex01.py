'''
Elaborar um código python que realize a impressão da palavra senacque
existe dentro da string - “Aula do Senac 04” 
'''

string = "Aula do Senac 4"

for i in range(len(string)):
    if string[i] == 'S':
        start = i
    elif string[i] == 'c':
        end = i

print(string[start:end+1])


'''
Quero fazer uma versão mais difícel que verifica se existe a palavra Senac antes
'''

texto = input("Digite texto com ou sem a palavra \"Senac\": ")
busca = "Senac"

if texto.find("Senac"):
    for i in range(len(texto)):
        if texto[i] == 'S':
            if texto[i:i+len(busca)] == busca:
                print(busca)
else:
    print("Texto não contém a palavra Senac")