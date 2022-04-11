<h1 >Projeto ZG Hero do Programa de Aceleração da ZG Solutions</h1>

Lucas Hideki Abe

<h3>1) Primeira parte do projeto(K1-T3: Java/Groovy)</h3> 

  O objetivo dessa aplicação foi desenvolver um MVP do produto, na trilha (K1-T3):Java/Groovy, obedecendo aos seguintes critérios:
   - De início será implementado um MVP do software, utilizando de recursos mais simples;
   - O programa tem que manter um array de candidatos com no mínimo 5 candidatos cadastrados;
   - Cada candidato tem um atributo de competências, que também é um array. Por enquanto, as competências podem ser pré-definidas, tais como Python, Java, Spring Framework, Angular entre outras;
   - Não é obrigatório ser possível fazer o cadastro de novos candidatos ou empresas;
   - É obrigatório ser possível listar todas empresas e todos os candidatos;
   - Não é obrigatório implementar o sistema de curtidas ainda.

A aplicação se resume à um programa que simule um tinder para empresas e candidatos, com likes de ambos os lados. 

<h3>2) Segunda parte do projeto(K1-T4: Testes Unitários)</h3>

  Nessa etapa, terá de ser implementada a funcionalidade de inserir novos candidatos e empresas nas listas seguindo o TDD.
  Requisitos obrigatórios:
   - Crie um teste unitário para a etapa de cadastro de novo usuário (candidato ou empresa). É o teste para a inserção de novo elemento nos arrays.


<h3>3) Terceira parte do projeto(K1-T5: Javascript/Typescript)</h3>

  - Na etapa de Typescript, o Frontend da aplicação deve ser aplicado sem a integração. Todo o código do Frontend está na pasta "Frontend", e para executar o projeto, basta dar "npm start" nessa pasta e abrir no navegador no localhost:8080/. A página inicial estará na pasta "paginaInicial", em "tipo.html", ou simplesmente digite localhost:8080/paginaInicial/tipo.html.

<h3>4) Quarta parte do projeto(K1-T6: REGEX)</h3>
  - Nessa etapa foi realizada a implementação de expressões REGEX no Frontend da aplicação.
  
<h3>5) Quinta parte do projeto(K1-T7: Banco de Dados)</h3>
  - Na etapa de banco de dados, o projeto introdutório consistiu em criar o SQL das tabelas e realizas inserts de alguns candidatos e empresas. As seguintes tabelas foram desenvolvidas. A workbench do MySQL foi utilizada para desenvolver o <a href="https://github.com/hideki-abe/ZG-HERO-Project/blob/master/MER/MER.png">MER do projeto</a>. <br/> <br/>
  - As classes do banco de dados estão na pasta DAO e para rodar com a integração no BD, uma classe Main foi desenvolvida para cada tabela do MER. Basta rodar cada Main separadamente e testar os CRUDS no Banco de Dados.

CREATE TABLE competencias ( <br/>
  id SERIAL NOT NULL PRIMARY KEY, <br/>
  nome VARCHAR(45) NOT NULL <br/>
);<br/><br/>

CREATE TABLE candidatos ( <br/>
  id SERIAL NOT NULL PRIMARY KEY, <br/>
  nome VARCHAR(45) NOT NULL, <br/>
  sobrenome VARCHAR(45) NOT NULL, <br/>
  data_de_nascimento VARCHAR(45) NOT NULL, <br/>
  email VARCHAR(45) NOT NULL, <br/>
  cpf VARCHAR(45) NOT NULL, <br/>
  pais VARCHAR(45) NOT NULL, <br/>
  cep VARCHAR(45) NOT NULL, <br/>
  descricao VARCHAR(100) NOT NULL, <br/>
  senha VARCHAR(20) NOT NULL, <br/>
  id_competencias INT REFERENCES competencias(id) NOT NULL <br/>
); <br/>

CREATE TABLE empresas ( <br/>
  id SERIAL NOT NULL PRIMARY KEY, <br/>
  nome VARCHAR(45) NOT NULL, <br/>
  cnpj VARCHAR(45) NOT NULL, <br/>
  email VARCHAR(45) NOT NULL, <br/>
  descricao VARCHAR(45) NOT NULL, <br/>
  pais VARCHAR(45) NOT NULL, <br/>
  cep VARCHAR(45) NOT NULL, <br/>
  senha VARCHAR(20) NOT NULL <br/>
); <br/> <br/>


CREATE TABLE vagas ( <br/>
  id SERIAL PRIMARY KEY, <br/>
  nome VARCHAR(45) NOT NULL, <br/>
  descricao VARCHAR(45) NOT NULL, <br/>
  lugar VARCHAR(45) NOT NULL, <br/>
  id_empresas INT REFERENCES empresas(id) NOT NULL, <br/>
  id_competencias INT REFERENCES competencias(id) NOT NULL <br/>
); <br/><br/>

INSERT INTO competencias(nome) VALUES ('React'); <br/>
INSERT INTO competencias(nome) VALUES ('Javascript'); <br/>
INSERT INTO competencias(nome) VALUES ('Java');<br/>
INSERT INTO competencias(nome) VALUES ('Groovy'); <br/>
INSERT INTO competencias(nome) VALUES ('HTML/CSS'); <br/>
INSERT INTO competencias(nome) VALUES ('PHP'); <br/>
INSERT INTO competencias(nome) VALUES ('Angular'); <br/>
INSERT INTO competencias(nome) VALUES ('PostgreeSQL'); <br/> <br/>

INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, cpf, pais, cep, descricao, senha, id_competencias) VALUES <br/>
		('Lucas', 'Hideki', '1997-12-16', 'hideki-abe@hotmail.com', '123456789', 'Brasil', '74455050', 'Estudante de engenharia de computação', '123456', 1); <br/>
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, cpf, pais, cep, descricao, senha, id_competencias) VALUES <br/>
		('João', 'Gomes', '2000-05-14', 'joão@email.com', '123456789', 'Brasil', '12345678', 'Goiano com muita vontade de trabalhar', '123456', 2); 
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, cpf, pais, cep, descricao, senha, id_competencias) VALUES  <br/>
		('Maria', 'Silva', '2003-03-30', 'maria@email.com', '123456789', 'Brasil', '74455050', 'Estudante de engeharia de software', '123456', 5);     
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, cpf, pais, cep, descricao, senha, id_competencias) VALUES <br/>
		('Ricardo', 'Alves', '1980-06-06', 'ricardo@email.com', '123456789', 'Brasil', '74455050', 'Programador Java', '123456', 3);    
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, cpf, pais, cep, descricao, senha, id_competencias) VALUES <br/>
		('Luana', 'Alves', '1990-09-12', 'luana@email.com', '123456789', 'Brasil', '74455050', 'Goiana com muita vontade de trabalhar', '123456', 7);<br/><br/>


INSERT INTO empresas(nome, cnpj, email, descricao, pais, cep, senha) VALUES ('Empresa 1', '123456789', 'empresa1@email.com', 'Empresa buscando funcionários', 'Brasil', '74455050', '123456'); <br/>
INSERT INTO empresas(nome, cnpj, email, descricao, pais, cep, senha) VALUES ('Empresa 2', '123456789', 'empresa2@email.com', 'Procura-se especialista em React', 'Brasil', '74455050', '123456'); <br/>
INSERT INTO empresas(nome, cnpj, email, descricao, pais, cep, senha) VALUES ('Empresa 3', '123456789', 'empresa3@email.com', 'Procuramos dev fullstack voltado para Java','Brasil', '74455050', '123456');                                                                        
INSERT INTO empresas(nome, cnpj, email, descricao, pais, cep, senha) VALUES ('Empresa 4', '123456789', 'empresa4@email.com', 'Procura-se estagiários, Salário: R$ 1000,00', 'Brasil', '74455050', '123456');                                                                             
INSERT INTO empresas(nome, cnpj, email, descricao, pais, cep, senha) VALUES ('Empresa 5', '123456789', 'empresa5@email.com', 'Procuramos aprendizes', 'Brasil', '74455050', '123456'); <br/>

INSERT INTO vagas(nome, descricao, lugar, id_empresas, id_competencias) VALUES ('Desenvolvedor backend', 'Procuramos dev fullstack voltado para Java', 'Brasil', 3, 3);
INSERT INTO vagas(nome, descricao, lugar, id_empresas, id_competencias) VALUES ('Desenvolvedor frontend', 'Procuramos dev fullstack voltado para React','Brasil', 2, 3);  
INSERT INTO vagas(nome, descricao, lugar, id_empresas, id_competencias) VALUES ('Desenvolvedor fullstack', 'Procuramos dev fullstack Javascript/PHP',  'Brasil', 1, 3);  
INSERT INTO vagas(nome, descricao, lugar, id_empresas, id_competencias) VALUES ('Desenvolvedor React', 'Procuramos dev Júnior frontend', 
'Brasil', 4, 2); </br>
INSERT INTO vagas(nome, descricao, lugar, id_empresas, id_competencias) VALUES ('Desenvolvedor Angular', 'Procuramos aprendizes', 'Brasil', 5, 2);



<h3>Executando o projeto: Backend </h3>
  Para executar o projeto, é necessário utilizar a IDE Intellijj para maior compatibilidade. Ao se abrir o projeto, é possível rodar o painel principal "Main" na própria IDE, ou também os testes unitários dando <b>run</b> na classe.
  
