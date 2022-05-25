<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/cadastroCandidato" var="linkServletCadastroCandidato" />

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="../reset.css" media="screen"/>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./cadastroCandidato.css" media="screen"/>
    <title>Cadastro de Candidato</title>
</head>
<body>
<div class="titulo">CADASTRO DE CANDIDATO</div>
<div>
    <ul>
        <c:forEach items="${[1, 2, 3]}" var="num">
            <li>${num}</li>
        </c:forEach>
    </ul>
</div>
<div class="painel_cadastro">
    <form class="form_cadastro" action="${linkServletCadastroCandidato}" method="post">
        <label for="nome">Nome:</label><br>
        <input type="text" id="nome" name="nome"><br>
        <label for="email">Email:</label><br>
        <input type="text" minlength="10" maxlength="25" id="email" name="email"><br>
        <label for="cpf">Cpf:</label><br>
        <input type="text" minlength="11" maxlength="11" id="cpf" name="cpf"><br>
        <label for="idade">Idade:</label><br>
        <input type="text" maxlength="2" id="idade" name="idade"><br>
        <label for="estado">Estado:</label><br>
        <input type="text" id="estado" name="estado"><br>
        <label for="cep">Cep:</label><br>
        <input type="text" id="cep" name="cep"><br>
        <label for="descricao">Descrição:</label><br>
        <input type="text" id="descricao" name="descricao"><br>
        <label for="senha">Senha:</label><br>
        <input type="password" id="senha" name="senha"><br>

        <input id="link" type="submit"/>
    </form>

</div>
<script type="module" src="./cadastroCandidato.js"></script>
</body>
</html>