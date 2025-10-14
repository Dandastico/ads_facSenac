
SELECT * FROM PRODUTOS;
SELECT * FROM CLIENTES;
SELECT * FROM VENDAS;

/*
	1 - NOME, O CPF, O TELEFONE E O EMAIL DE CLIENTES QUE FIZERAM COMPRAS ACIMA DE 5 MIL REAIS;
    2 - NOME, CPF E TELEFONE DE CLIENTES QUE FIZERAM COMPRAS EM 2025
    3 - NOME E DO TELEFONE DE CLIENTES QUE FIZERAM COMPRAS E TENHAM DDD 61
    4 - VALOR DE VENDA DE TODOS OS PRODUTOS DA LG VENDIDOS NA LOJA
*/

-- 1 - NOME, O CPF, O TELEFONE E O EMAIL DE CLIENTES QUE FIZERAM COMPRAS ACIMA DE 5 MIL REAIS
SELECT
	c.nome,
    c.cpf,
    c.email,
    v.valor
FROM 
	CLIENTES c
INNER JOIN
	VENDAS v
ON c.cpf = v.cpf_cliente
WHERE v.valor > 5000;

-- 2 - NOME, CPF E TELEFONE DE CLIENTES QUE FIZERAM COMPRAS EM 2025
SELECT
	c.nome,
    c.cpf,
    c.telefone
FROM
	CLIENTES c
INNER JOIN
	VENDAS v
ON
	c.cpf = v.cpf_cliente
WHERE YEAR(data_venda) = 2025;

-- 3 - NOME E DO TELEFONE DE CLIENTES QUE FIZERAM COMPRAS E TENHAM DDD 61
SELECT
	c.nome,
    c.telefone
FROM
	CLIENTES c
INNER JOIN
	VENDAS v
ON c.cpf = v.cpf_cliente
WHERE
	c.telefone LIKE "61%";
    
-- 4 - VALOR DE VENDA DE TODOS OS PRODUTOS DA LG VENDIDOS NA LOJA
SELECT
	p.modelo,
    p.marca,
	v.valor
FROM 
	PRODUTOS p
INNER JOIN
	VENDAS v
ON p.id = v.id_produto
WHERE p.marca = "LG";

-- 

SELECT
	c.nome,
    c.telefone,
    v.valor,
    v.data_venda
FROM
	CLIENTES c
INNER JOIN
	VENDAS v
ON c.cpf = v.cpf_cliente
INNER JOIN
	PRODUTOS p
ON v.id_produto = p.id
WHERE p.marca = "Sony"
ORDER BY v.valor DESC
;


-- Nome, telefone, valor de venda e data da venda de todos os notebooks vendidos
-- entre janeiro e março

SELECT
	c.nome,
    c.telefone,
    v.valor,
    v.data_venda
FROM CLIENTES c
INNER JOIN VENDAS v
ON c.cpf = v.cpf_cliente
INNER JOIN PRODUTOS p
ON v.id_produto = id
WHERE
	MONTH(v.data_venda) >= 01
    AND MONTH(v.data_venda) <= 03
    AND p.categoria = "Notebook"
;


-- nome, teleone, valor de venda e data da venda de todos os clientes que
-- compraram produtos da marca samsums ou
-- cujo modelo contenha a palavra galaxy

SELECT
	c.nome,
    c.telefone,
    v.valor,
    v.data_venda
FROM CLIENTES c
INNER JOIN VENDAS v
ON c.cpf = v.cpf_cliente
INNER JOIN PRODUTOS p
ON p.id = v.id_produto
WHERE
	p.marca = "Samsung"
    OR modelo LIKE "%Galaxy%"
;

