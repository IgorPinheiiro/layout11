CREATE TABLE aluno (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INTEGER NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    responsavel VARCHAR(100) NOT NULL,
    observacao TEXT
);

