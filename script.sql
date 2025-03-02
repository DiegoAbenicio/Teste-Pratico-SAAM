-- Caso queira criar o banco também por sql, descomente as linhas abaixo
/*
DROP DATABASE IF EXISTS teste_pratico_saam;
CREATE DATABASE teste_pratico_saam;
\c teste_pratico_saam;
*/

-- Confrimando que as tabelas não existem
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS users;

-- Criando a tabela de funcionários
CREATE TABLE public.employees (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    status BOOLEAN NOT NULL,
    remuneration NUMERIC(10,2) NOT NULL,
    admission_date DATE NOT NULL
);

-- Criando a tabela de usuários
CREATE TABLE public.users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(64) NOT NULL
);

