import sys

try:
    with open("texto.txt", 'r', encoding="utf8") as f:
        text = f.read()
except FileNotFoundError:
    sys.exit("Arquivo não existe")
finally: # o que está no finallly roda não importa o que aconteça
    print(text)


try:
    with open("texto.txt", 'r', encoding="utf8") as f:
        text = f.read()
except FileNotFoundError:
    sys.exit("Arquivo não existe")
else: # só roda o que está em else se tiver dado certo
    print(text)