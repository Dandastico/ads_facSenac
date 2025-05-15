import pandas as pd

# carregar arquivo csv
def carregarDados(nomeArquivo):
    try:
        # biblioteca pandas tem múltiplos métodos para ler arquivos
        dados = pd.read_csv(nomeArquivo)
        print(dados)    # imprime o arquivo csv como tabela
    except:
        print("Arquivo não encontrado")
    else:
        return dados
    return None


# imprime atributos do objeto e retirar algumas linhas não interessantes
def prepararDados(dados):
    print(dados.info())    # imprime algo parecido com schema
    print(dados.describe())    # imprime uma estatística básica sobre os dados

    print(dados.head())    # recupera os 5 primeiros registros
    print(dados.tail())    # recupera os 5 últimos registros (as tranqueiras costumam ficar no final)

    #remove uma coluna do data frama em memória, de modo local
    dados.drop(columns=["Cabin"], inplace=True)

    dados = dados.dropna()    # remove os dados nulos
    dados = dados.drop_duplicates()    # remove dados duplicados
    
    '''
    for linha in dados.values:
        for coluna in linha:
            print(coluna)
    
    Consumo quadráditico, consome muitos recursos
    '''

    return dados


NOMEARQUIVO = "Titanic-Dataset.csv"
# carregar conjunto de dados para a atividade de engenharia de daos
dados = carregarDados(NOMEARQUIVO)

# preparar os dados para processamento de ML ou Analytics
if dados is not None:
    dados = prepararDados(dados)


    