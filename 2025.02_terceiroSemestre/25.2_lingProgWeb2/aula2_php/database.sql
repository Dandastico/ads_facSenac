--criar banco de dados 'php'
CREATE SCHEMA `php` ;

--criar tabela 'alunos' no banco de dados
CREATE TABLE `php`.`alunos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL,
  `ultimo_nome` VARCHAR(50) NULL,
  `email` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

--criar tabela turma
CREATE TABLE `php`.`turma` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(50) NULL,
  PRIMARY KEY (`id`));

-- alterar tabela alunos ter FOREIGN KEY
ALTER TABLE `php`.`alunos`
ADD COLUMN turma.id int,
ADD CONSTRAINT fk_turma
    FOREIGN KEY (turma_id) REFERENCES turma(id);

--inserir um valor na coluna alunos 
INSERT INTO `php`.`alunos`(`nome`, `ultimo_nome`, `email`)
VALUES ('teste', 'testando', 'teste@teste.com');