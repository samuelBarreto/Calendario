<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="css/jquery.css" rel="stylesheet">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<title>Adiciona Contatos</title>
</head>
<body>

	<c:import url="cabecalho.jsp" />
	<%@ taglib tagdir="/WEB-INF/tags" prefix="taglib"%>

	<h1>Adiciona Contatos</h1>
	<hr />
	<form action="adicionaContato" method="post">
		<taglib:campoTexto rotulo="Nome:" id="nome" /><br />
		<taglib:campoTexto rotulo="E-mail:" id="email" /><br />
		<taglib:campoTexto rotulo="Projeto:" id="projeto" /><br />
		<taglib:campoData rotulo="Data Inicio" id="dataNascimento" /><br />
		<taglib:campoData rotulo="Data Final" id="dataFinal" /><br />
		<input type="submit" value="Gravar" />
	</form>
	<c:import url="rodape.jsp" />
	
</body>
</html>