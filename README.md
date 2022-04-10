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
 - Na etapa de banco de dados, o projeto introdutório consistiu em criar o SQL das tabelas e realizas inserts de alguns candidatos e empresas. As seguintes tabelas foram desenvolvidas. <br/> <br/>

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
  competencias VARCHAR(45) NOT NULL, <br/>
  local VARCHAR(45) NOT NULL, <br/>
  id_empresas INT REFERENCES empresas(id) NOT NULL, <br/>
  id_competencias INT REFERENCES competencias(id) NOT NULL <br/>
); <br/><br/>


<h3>Executando o projeto: Backend </h3>
  Para executar o projeto, é necessário utilizar a IDE Intellijj para maior compatibilidade. Ao se abrir o projeto, é possível rodar o painel principal "Main" na própria IDE, ou também os testes unitários dando <b>run</b> na classe.
  
