import pandas as pd

# biblioteca pandas tem múltiplos métodos para ler arquivos
dados = pd.read_csv("Titanic-Dataset.csv")
print(dados)
print(dados.info())
