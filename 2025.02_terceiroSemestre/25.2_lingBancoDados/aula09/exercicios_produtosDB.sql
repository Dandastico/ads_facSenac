/*
EXERCÍCIOS
1- Informe quantos celulares foram vendidos por ano
2- Informe o produto mais barato vendido por ano
3- Informe a média de vendas por ano
4- Informe a soma de vendas por anoALUNOS
5- Informe quantos produtos de cada categoria estão disponíveis para venda
*/

SELECT * FROM PRODUTOS;

-- quantos celulares foram vendidos por ano
SELECT ano_aquisicao, COUNT(*) AS celulares_vendidos
FROM PRODUTOS
WHERE status_venda = 'Vendido' AND
categoria = 'Celular'
GROUP BY ano_aquisicao
ORDER BY ano_aquisicao;

-- produto mais barato vendido por ano
SELECT ano_aquisicao, MIN(valor) AS celular_mais_barato
FROM PRODUTOS
WHERE status_venda = 'Vendido'
GROUP BY ano_aquisicao
ORDER BY ano_aquisicao;

-- média de vendas por ano
SELECT ano_aquisicao, AVG(valor) AS media_vendas
FROM PRODUTOS
WHERE status_venda = 'Vendido'
GROUP BY ano_aquisicao
ORDER BY ano_aquisicao;

-- soma de vendas por ano
SELECT ano_aquisicao, SUM(valor) AS soma_das_vendas
FROM PRODUTOS
WHERE status_venda = 'Vendido'
GROUP BY ano_aquisicao
ORDER BY ano_aquisicao;

-- quantos produtos de cada categoria disponíveis para venda
SELECT categoria, COUNT(*) AS quant_produtos_disponiveis
FROM PRODUTOS
WHERE status_venda = 'Disponível'
GROUP BY categoria
ORDER BY categoria;