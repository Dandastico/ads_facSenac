string = "senac é muito legal. daniel é mais legal"


# imprimir frases antes e depois do ponto final
strings = string.capitalize().split(". ")

for s in strings:
    print(s)


'''contar quantidade de palavras na string original'''
string = "o melhor de brasília ao alcance do brasil"
strings = string.split(' ')
count = 0
for word in strings:
    count += 1

print("Número de palavras", count)


''' contar quantidade de vezes que palavras se repetem'''
string = "daniel é muito legal, mas a namorada dele é muito mais legal!"
pontuactions = ['.', ',', '!', '?']
for pontuaction in pontuactions:
    string = string.replace(pontuaction, '')

num_words = {}
words = string.split(' ')
for key in words:
    # se já tiver adicionado a chave ao dict, adicione 1
    if key in num_words:
        num_words[key] += 1
    # se chave ainda não estiver no dict, insere-o com valor 1
    else:
        num_words[key] = 1

print(num_words)


'''quantidade de artigos e preposições'''
lista = ["a", "as", "o", "os", "de", "ao", "antes", "de", "do"]
string = "o melhor de brasília ao alcance do brasil"

# constrói lista de palavras separando a string
words = string.split(' ')

# checa cada palavra da lista, adicione 1 se está na lista de art e prep
count = 0
for word in words:
    if word in lista:
        count += 1

print(count)