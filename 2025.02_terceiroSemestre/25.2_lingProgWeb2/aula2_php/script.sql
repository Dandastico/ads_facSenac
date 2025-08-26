INSERT INTO `php`.`alunos`(`nome`, `ultimo_nome`, `email`)
VALUES ('teste', 'testando', 'teste@teste.com');

SELECT * FROM php.alunos;

ALTER TABLE `php`.`alunos`
ADD COLUMN turma_id int,
ADD CONSTRAINT fk_turma
    FOREIGN KEY (turma_id) REFERENCES turma(id);
    
INSERT INTO php.turma(`descricao`)
VALUES ('A'); 

INSERT INTO php.turma(`descricao`) VALUES('B');