import pandas as pd

def carregarDados(nomeArquivo):
    # biblioteca pandas tem múltiplos métodos para ler arquivos
    try:
        dados = pd.read_csv(nomeArquivo)
        print(dados)    # imprime o arquivo csv como tabela
    except:
        print("Arquivo não encontrado")
    else:
        return dados
    return None


def prepararDados(dados):
    print(dados.info())    # imprime algo parecido com schema
    print(dados.describe())    # imprime uma estatística básica sobre os dados

    # métodos que alteram valores "inplace", direto na memória
    dados.dropna()    # remove os dados nulos
    dados.drop_duplicates()    # remove dados duplicados

    return dados


NOMEARQUIVO = "Titanic-Dataset.csv"
# carregar conjunto de dados para a atividade de engenharia de daos
dados = carregarDados(NOMEARQUIVO)

# preparar os dados para processamento de ML ou Analytics
if dados is not None:
    dados = prepararDados(dados)


    