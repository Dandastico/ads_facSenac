create schema cadastro;

create table usuarios(
    nome varchar (45) not null,
    senha varchar(45) not null,
    email varchar(45) not null,
    cpf varchar(45) not null,
    data varchar(45) null,
    PRIMARY KEY (cpf)

)

INSERT INTO (`nome`,`senha`,`email`,`cpf`,`data`)
VALUES('$nome' , '$senha' ,'$email' ,'$cpf' ,'$data');