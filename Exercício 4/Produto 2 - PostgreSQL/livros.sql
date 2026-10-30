
-- Produto 2: PostgreSQL no Azure
-- Tabela de livros fictícios

-- 1. Criar a tabela
CREATE TABLE livros (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    ano_publicacao INTEGER
);

-- 2. Inserir três registros fictícios
INSERT INTO livros (titulo, autor, ano_publicacao)
VALUES
    ('A Cidade das Estrelas', 'Ana Martins', 2020),
    ('Algoritmos do Amanhã', 'Pedro Almeida', 2022),
    ('Jardins de Marte', 'Lucas Ferreira', 2024);

-- 3. Consultar os registros
SELECT * FROM livros;
