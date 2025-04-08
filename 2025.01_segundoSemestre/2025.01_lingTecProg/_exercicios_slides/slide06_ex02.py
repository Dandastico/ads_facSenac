'''
Construa uma código python chamado financeiro.py, que
realize o calculo do desconto de 10% sobre uma venda
de R$ 100.
'''

def calc_desconto(valor, perc):
    return valor * perc / 100


print(calc_desconto(100, 10))