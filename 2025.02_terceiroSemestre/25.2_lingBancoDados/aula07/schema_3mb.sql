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

-- Adicionando uma coluna na tabela existente
ALTER TABLE gravadoras
ADD COLUMN email CHAR(200);

-- Modificando característica do campo
ALTER TABLE gravadoras
MODIFY COLUMN fone INTEGER;

-- Renomeando uma colina
ALTER TABLE gravadoras
CHANGE COLUMN nome_grav nome VARCHAR(80);

-- Deletando coluna id_gravadora da tabela gravadoras
ALTER TABLE gravadoras
DROP id_gravadora;

-- Adicionando a coluna sem designá-la como chave primária
ALTER TABLE gravadoras
ADD COLUMN id_gravadora SMALLINT;

-- Designando a coluna id_gravadora como chave primária novamente
ALTER TABLE gravadoras
ADD PRIMARY KEY (id_gravadora);