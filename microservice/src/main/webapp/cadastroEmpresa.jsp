<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="../reset.css" media="screen"/>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="./cadastroEmpresa.css" media="screen"/>
        <title>Cadastro de Empresa</title>
    </head>
    <body>
    <div class="titulo">CADASTRO DE EMPRESA</div>
    <div class="painel_cadastro">
        <form class="form_cadastro">
            <label for="nome">Nome:</label><br>
            <input type="text" id="nome" name="nome"><br>
            <label for="email">Email:</label><br>
            <input type="text" id="email" name="email"><br>
            <label for="cpf">Cnpj:</label><br>
            <input type="text" id="cnpj" name="cnpj"><br>
            <label for="idade">País:</label><br>
            <input type="text" id="pais" name="pais"><br>
            <label for="estado">Estado:</label><br>
            <input type="text" id="estado" name="estado"><br>
            <label for="cep">Cep:</label><br>
            <input type="text" id="cep" name="cep"><br>
            <label for="descricao">Descrição:</label><br>
            <input type="text" id="descricao" name="descricao"><br>
        </form>
        <a id="link" href="./cadastroEmpresa">
            <button type="submit" value="Cadastrar" class="botao_cadastrar">Cadastrar</button>
        </a>
    </div>
    <script type="module" src="./cadastroEmpresa.js"></script>
    </body>
</html>