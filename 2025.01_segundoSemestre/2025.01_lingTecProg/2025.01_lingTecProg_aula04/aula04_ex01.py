txt = "Aula do Senac 04"
pos = 0

for char in txt:
    if char == 'S':
        s = pos
    if char == 'c':
        c = pos
    pos += 1

print(txt[s:c+1])