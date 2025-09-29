USE TURMAB;

/*
FUNÇÕES DE AGRAGAÇÃ
1 - O gerente precisa saber o total de venda em reais
*/

SELECT SUM(valor) FROM PRODUTOS
WHERE status_venda = 'Vendido';