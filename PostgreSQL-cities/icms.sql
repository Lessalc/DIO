--
-- Estrutura da tabela "icms"
--

DROP TABLE IF EXISTS "icms" CASCADE;

CREATE TABLE icms (
  id     bigserial NOT NULL,
  uf  integer,
  taxa   double precision,
  CONSTRAINT icms_pkey
    PRIMARY KEY (id)
);

COMMENT ON TABLE icms
  IS 'DIFAL entre as Unidades Federativas';

--
-- Inserindo dados na tabela "icms"
--

INSERT INTO "icms" (id, uf, taxa) VALUES
(1, 1, 18.0),
(2, 2, 18.0),
(3, 3, 16.0),
(4, 4, 16.0),
(5, 5, 18.0),
(6, 6, 18.0),
(7, 7, 17.0),
(8, 8, 18.0),
(9, 9, 18.0),
(10,10, 18),
(11,11, 17.5),
(12,12, 16.0),
(13,13, 18.0),
(14,14, 18.0),
(15,15, 18.0),
(16,16, 17.5),
(17,17, 20.0),
(18,18, 18.0),
(19,19, 18.0),
(20,20, 21.0),
(21,21, 16.0),
(22,22, 18.0),
(23,23, 14.0),
(24,24, 18.0),
(25,25, 18.0),
(26,26, 18.0),
(27,27, 18.0);

