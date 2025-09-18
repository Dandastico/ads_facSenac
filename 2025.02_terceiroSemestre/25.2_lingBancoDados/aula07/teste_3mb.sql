-- Criando schema 
CREATE SCHEMA teste_3mb;

-- Alocando-se ao schema/database
USE teste_3mb;

-- Criando a tabela gravadora
CREATE TABLE IF NOT EXISTS gravadoras(
	id_gravadora SMALLINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    fone CHAR(15) NOT NULL,
    PRIMARY KEY(id_gravadora)
)
ENGINE=InnoDB;
