<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=">
<title>CADASTRO DE USUARIOS</title>
</head>
<body>
	<h1>Cadastro de Usuarios</h1>
	<h3>Digite seus dados:</h3>
	<br>
	<br>
	<form:form action="" modelAtribute="">
    	Nome: <form:input path="nome" />
		<br />
		CPF:<form:input path="cpf" />
		<br />
		Idade <form:input path="idade" />
		<br />
		<button type="submit">Salvar</button>
	</form:form>
</body>
</html>