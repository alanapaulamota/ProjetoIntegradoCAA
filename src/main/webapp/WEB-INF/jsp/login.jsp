<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Login</title>
<!-- CSS - ADICIONAR BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1"
	charset="utf-8">
</head>
<header>
	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand">Login</a>
		<form class="form-inline"></form>
	</nav>
</header>
<body>
	<div class="container" style="padding-top: 80px;">
		<div class="row">
			<!-- 			<div class="col-md-8"> -->
			<div class="col-md-6 text-left">
				<img src="/images/avatar.svg" alt="avatar" style="width: 30%"><br>
				<br>
				<h1>PARA CONTINUAR</h1>
				<br />
				<form class="form-horizontal" method="post" action="/save" role="form">
					<div class="form-group">
						<label for="cpf" class="col-sm-3 control-label">CPF</label>
						<div class="col-sm-8">
							<input type="text" required class="form-control" id="cpf" name="cpf"
								min="11" max="11" pattern="^(\d{3}\.\d{3}\.\d{3}-\d{2})|(\d{11})$"
								placeholder="Digite aqui seu CPF" />
						</div>
					</div>
					<div class="form-group">
						<label for="senha" class="col-sm-3 control-label">Senha</label>
						<div class="col-sm-8">
							<input type="password" required id="senha" class="form-control"
								name="senha" placeholder="Digite aqui sua senha" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-10 col-sm-10">
							<button type="submit" class="btn btn-success btn-block">Entrar</button>
							<!-- 								<input type="button" class="btn btn-success btn-block" onclick="location.href='/welcome.jsp'" value="Entrar" /> -->
							<!-- <a href="/welcome"><input type="button" class="btn btn-success btn-block" value="Entrar" /> -->
						</div>
					</div>
				</form>
				<!-- 					<img src="img/avatar_login.svg" class="img-responsive pull-left " -->
				<!-- 						width="50px"> -->
			</div>
		</div>
	</div>
</body>
</html>
<!-- <script type="text/javascript" src="js/main.js"></script> -->
