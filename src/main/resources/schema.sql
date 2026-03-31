CREATE DATABASE IF NOT EXISTS riserva;

USE riserva;

CREATE TABLE IF NOT EXISTS specie (
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_comune     VARCHAR(100) NOT NULL,
    nome_scientifico VARCHAR(150) NOT NULL,
    descrizione     TEXT
);

CREATE TABLE IF NOT EXISTS animali (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome        VARCHAR(100) NOT NULL,
    eta         INT,
    peso        DOUBLE,
    specie_id   BIGINT NOT NULL,
    CONSTRAINT fk_animali_specie FOREIGN KEY (specie_id) REFERENCES specie(id)
);
