use TURMAB;

SELECT * FROM PRODUTOS;
SELECT * FROM CLIENTES;
SELECT * FROM VENDAS;

-- O gerente precisa saber a marca,
-- o modelo, a categoria, o cpf, o valor do produto
-- e o valor da venda de todas as vendas que foram realizadas

SELECT
	PRODUTOS.marca, PRODUTOS.modelo, PRODUTOS.categoria, PRODUTOS.valor,
	VENDAS.valor, VENDAS.cpf_cliente
FROM PRODUTOS
INNER JOIN VENDAS ON PRODUTOS.id = VENDAS.id_produto -- interseção entre duas tabelas
;

-- Relatório contendo

SELECT
	PRODUTOS.marca, PRODUTOS.modelo, PRODUTOS.categoria, PRODUTOS.valor,
	VENDAS.valor, VENDAS.cpf_cliente
FROM PRODUTOS
INNER JOIN VENDAS ON PRODUTOS.id = VENDAS.id_produto -- interseção entre duas tabelas
WHERE VENDAS.valor >= 1000;
;
