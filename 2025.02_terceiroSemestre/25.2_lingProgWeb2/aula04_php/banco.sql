CREATE SCHEMA `php` ;

CREATE TABLE `php`.`alunos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `ultimo_nome` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
COMMENT = 'Tabela exemplo para estudo do MySql conectando php.';
