-- V2 MIGRATIONS: Adicionar coluna "Rank" na tabela ninjas --

ALTER TABLE ninjas
ADD COLUMN Rank VARCHAR(50);