-- SQL/DML INSERT, UPDATE DELETE e SELECT
-- Inserir dados na tabela `gravadoras`
INSERT INTO gravadoras(nome, fone, email, id_gravadora)
VALUES
	("Atlanta", 6112345, "email@email.com", 1);
    
-- Consultar toda a tabela `gravadoras`
SELECT *
FROM gravadoras;

-- Inserção de outras gravadoras na tabela gravadoras
INSERT INTO gravadoras(nome, fone, email, id_gravadora)
VALUES
	("Poligram", 61827392, "email@email.com", 2);

INSERT INTO gravadoras(nome, fone, email, id_gravadora)
VALUES ("EMI", 278162, "email@email.com", 3);

-- Consulta alterando ordem das colunas
SELECT id_gravadora, nome, fone, email
FROM gravadoras;

-- Cagando a table toda
UPDATE gravadoras
SET nome = "Nome Alterado";
-- Vai alterar os nomes de todas as linhas da tabela

-- Atualizando corretamente
UPDATE gravadoras
SET nome = "Nome Alterado"
WHERE id_gravadora = 1;
-- Altera o nome apenas da gravadora com id_gravadora igual a 1