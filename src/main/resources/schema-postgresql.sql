CREATE TABLE IF NOT EXISTS aluno (
     id serial PRIMARY KEY,
     nome  varchar(50),
     telefone   varchar(12),
     idade int(2),
     observacao varchar(50),
     responsavel varchar(50)
);