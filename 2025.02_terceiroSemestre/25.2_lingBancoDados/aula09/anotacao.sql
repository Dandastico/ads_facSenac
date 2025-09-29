USE TURMAB;

SELECT *
FROM PRODUTOS;

/*
FUNÇÕES DE AGRAGAÇÃO
O gerente precisa saber:
1 - o total de venda em reais - SUM()
2 - o valor médio de vendas em reais - AVG()
3 - a venda com maior valor - MAX()
4 - a venda com menor valor - MIN()
5 - quantidade de vendas - COUNT()
*/

-- função soma
SELECT SUM(valor) FROM PRODUTOS
WHERE status_venda = 'Vendido';

-- média
SELECT AVG(valor) FROM PRODUTOS
WHERE status_venda = 'Vendido';

-- maior valor
SELECT MAX(valor) FROM PRODUTOS
WHERE status_venda = 'Vendido';

-- menor valor
SELECT MIN(valor) FROM PRODUTOS
WHERE status_venda = 'Vendido';

-- contagem das linhas
SELECT COUNT(*) FROM PRODUTOS
WHERE status_venda = 'Vendido';

/*
AGRUPAMENTO DE DADOS
8 - quantidade total de vendas por ano - GROUP BY
*/

SELECT ano_aquisicao, COUNT(*) AS quant_vendas
FROM PRODUTOS
WHERE status_venda = 'Vendido'
GROUP BY ano_aquisicao
ORDER BY ano_aquisicao;

