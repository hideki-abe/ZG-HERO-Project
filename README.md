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
  - <a href="https://github.com/hideki-abe/ZG-HERO-Project/blob/master/linkedtinder.sql">SQL da modelagem do Banco de dados.</a>
  - As classes do banco de dados estão na pasta DAO e para rodar com a integração no BD, uma classe Main foi desenvolvida para cada tabela do MER. Basta rodar cada Main separadamente e testar os CRUDS no Banco de Dados. </br> </br>
	


<h3>6) Sexta parte do projeto(K2-T1: Clean Code)</h3>
Nessa parte do projeto, foram refatoradas as seguintes classes seguintos os princípios do CLEAN CODE.
	Classes refatoradas:
	
 	- Competencia (legibilidade)
 	- ListaDePessoas (exclusão de métodos não utilizados)
 	- Main (excluída)
	- Pessoas (exclusão de métodos não utilizados)
	- Vaga (formatação)
	- Testes unitários (remoção)
	- Testes DAO (implementação)

<h3>7) Sétima parte do projeto(K2-T2: Princípios SOLID)</h3>
Os princípios SOLID foram adotados nessa parte do projeto e as seguintes mudanças foram feitas: 


<h3>Executando o projeto: Backend </h3>
  Para executar o projeto, é necessário utilizar a IDE Intellijj para maior compatibilidade. Ao se abrir o projeto, é possível rodar o painel principal "Main" na própria IDE, ou também os testes unitários dando <b>run</b> na classe.
  
