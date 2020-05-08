<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Usuarios .....</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 60%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

	<div style="margin-top: 50px; margin-left: 200px; height: 50px;">
		<h2>Lista de USR</h2>
	</div>
	<table style="margin-top: 0px; margin-left: 100px;">
		<tr>
			<th>Nome</th>
			<th>CPF</th>
			<th>IDADE</th>
		</tr>
		<c:forEach items="${listaUsuarios}" var="usr">
			<tr>
				<td>${usr.nome}</td>
				<td>${usr.cpf}</td>
				<td>${usr.idade}</td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<br>
	<a href="/">VOLTAR</a>
</body>
</html>