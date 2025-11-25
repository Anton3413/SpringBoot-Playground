-- liquibase formatted sql

--changeset bondar852:1

CREATE TABLE IF NOT EXISTS company
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR
);

CREATE TABLE IF NOT EXISTS users
(
    id         BIGSERIAL PRIMARY KEY,
    username   VARCHAR NOT NULL UNIQUE,
    first_name VARCHAR NOT NULL,
    last_name  VARCHAR NOT NULL,
    birth_date DATE    NOT NULL,
    role       VARCHAR NOT NULL,
    company_id INTEGER NOT NULL REFERENCES company (id)
);

INSERT INTO company (name)
VALUES ('Google');
