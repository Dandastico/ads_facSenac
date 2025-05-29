import sys

def main():
    # pedir por nome e validar nome
    nome = input("Digite seu nome: ")   
    if not validar_nome(nome):
        sys.exit("ERRO: Nome não válido, precisa ter mais de 3 caracteres")

    # pedir por idade e validar idade
    try:
        idade = int(input("Digite sua idade: "))
    except:
        print("ERRO: Idade deve ser um número inteiro")
    else:
        if not validar_idade(idade):
            sys.exit("ERRO: Idade permitida entre 0 e 150 incluso")
        
    # pedir por salário e validar salário
    try:
        salario = float(input("Digite seu salário: "))
    except:
        print("ERRO: Salário deve ser número")
    else:
        if not validar_salario(salario):
            sys.exit("ERRO: Salário deve ser maior que 0")

    # obter sexo e validar sexo
    sexo = input("Digite 'f' para feminino e 'm' para masculino: ")
    if not validar_sexo(sexo):
        sys.exit("ERRO: Sexo é feminino ou masculino")

    # obter estado civil e validar estado civil
    est_civil = input("Informe seu estado civil:\nDigite 's' para solteiro, 'c' para casado, 'v' para viúvo e 'd' para divorciado")
    if not validar_civil(est_civil):
        sys.exit("ERRO: Resposta não permitida para estado civil")

    print("Deu tudo certo, que chique")


def validar_nome(s):
    if len(s) < 4:
        return False
    return True


def validar_idade(n):
    if n < 0 or n > 150:
        return False
    return True


def validar_salario(n):
    if n <= 0:
        return False
    return True


def validar_sexo(c):
    validos = ['f', 'm']
    if c not in validos:
        return False
    return True


def validar_civil(c):
    validos = ['s', 'c', 'v', 'd']
    if c not in validos:
        return False
    return True


if __name__ == "__main__":
    main()