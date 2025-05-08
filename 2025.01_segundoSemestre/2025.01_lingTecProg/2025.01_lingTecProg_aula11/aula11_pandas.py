import pandas as pd

# biblioteca pandas tem múltiplos métodos para ler arquivos
dados = pd.read_csv("Titanic-Dataset.csv")

print(dados)    # imprime o arquivo csv como tabela

print(dados.info())    # imprime algo parecido com schema

print(dados.describe())    # imprime uma estatística básica sobre os dados

dados.dropna()    # remove os dados nulos

dados.drop_duplicates()    # remove dados duplicados
