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


-- Dati di esempio - Parco Naturale di Monte Arcosu (Sardegna)


INSERT INTO specie (id, nome_comune, nome_scientifico, descrizione) VALUES
(1, 'Cervo sardo',       'Cervus elaphus corsicanus', 'Sottospecie endemica del cervo europeo, simbolo della fauna sarda. Vive nei boschi di leccio e nelle macchie della Sardegna meridionale.'),
(2, 'Cinghiale sardo',   'Sus scrofa meridionalis',   'Sottospecie di cinghiale di taglia ridotta rispetto al continentale, presente in tutta la Sardegna. Onnivoro e molto adattabile.'),
(3, 'Volpe sarda',       'Vulpes vulpes ichnusae',    'Sottospecie insulare della volpe rossa, leggermente più piccola. Predatore opportunista diffuso nei boschi e nelle zone aperte.'),
(4, 'Gatto selvatico',   'Felis silvestris lybica',   'Felino selvatico difficile da avvistare, attivo principalmente di notte. Presente nelle aree boscose più impenetrabili di Monte Arcosu.'),
(5, 'Muflone',           'Ovis gmelini musimon',      'Ovide selvatico originario di Sardegna e Corsica, considerato tra i più antichi ovicaprini del mondo. Vive in zone rupestri e boschive.');

INSERT INTO animali (id, nome, eta, peso, specie_id) VALUES
(1,  'Yakul',    6,  98.5,  1),
(2,  'Bambi',    4,  87.0,  1),
(3,  'Aslan',    8,  110.2, 1),
(4,  'Okkoto',   3,  42.0,  2),
(5,  'Pumba',    5,  55.5,  2),
(6,  'Kurama',   2,  5.8,   3),
(7,  'Shippo',   4,  6.3,   3),
(8,  'Luna',     3,  4.1,   4),
(9,  'Yoruichi', 5,  4.9,   4),
(10, 'Toriel',   7,  38.0,  5);
