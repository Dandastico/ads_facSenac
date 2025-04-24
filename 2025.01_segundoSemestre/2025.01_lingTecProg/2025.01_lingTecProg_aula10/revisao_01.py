# Exercício de Revisão 01
# Utilizando a estrutura de dados "list", construa um código que empilhe 5 números

def main():
    n = get_numbers()
    
    pop_numbers(n)

def get_numbers():
    quant = 5
    n = list()
    for i in range(quant):
        try:
            n.append(int(input(f"Digite o {i+1}º número: ")))
        except:
            print("ERRO: Só é aceito números inteiros.")
    return n

def pop_numbers(n):
    for i in range(len(n)):
        print(f"{i+1}º número a sair da pilha: {n.pop()}")

if __name__ == "__main__":
    main()