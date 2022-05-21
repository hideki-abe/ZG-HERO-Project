CREATE TABLE candidatos (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL,
  sobrenome VARCHAR(45) NOT NULL,
  data_de_nascimento VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  cpf VARCHAR(45) NOT NULL,
  pais VARCHAR(45) NOT NULL,
  cep VARCHAR(45) NOT NULL,
  descricao VARCHAR(100) NOT NULL,
  senha VARCHAR(20) NOT NULL);

CREATE TABLE empresas(
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL,
  cnpj VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  descricao VARCHAR(45) NOT NULL,
  pais VARCHAR(45) NOT NULL,
  cep VARCHAR(45) NOT NULL,
  senha VARCHAR(20) NOT NULL
);


CREATE TABLE vagas (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL,
  descricao VARCHAR(45) NOT NULL,
  competencias VARCHAR(45) NOT NULL,
  local VARCHAR(45) NOT NULL,
  id_empresas INT REFERENCES empresas(id) NOT NULL,
);

CREATE TABLE competencias (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL
);

CREATE TABLE candidatos_competencias (
  id_candidato VARCHAR(5) NOT NULL,
  id_competencia VARCHAR(5) NOT NULL
);

CREATE TABLE empresas_competencias (
  id_empresa VARCHAR(5) NOT NULL,
  id_competencia VARCHAR(5) NOT NULL

);

