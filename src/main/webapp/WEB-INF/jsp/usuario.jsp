<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Pagina de Cadastro</title>
<!--CSS - ADICIONAR BOOTSTRAP-->
<!-- <link rel="stylesheet" -->
<!-- 	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" -->
<!-- 	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" -->
<!-- 	crossorigin="anonymous"> -->
<meta name="viewport" content="width=device-width, initial-scale=1"
	charset="utf-8">
<!-- <link rel="stylesheet" type="text/css" href="css/style.css"> -->
<!-- <link -->
<!-- 	href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" -->
<!-- 	rel="stylesheet"> -->
<script src="https://kit.fontawesome.com/a81368914c.js"></script>
</head>
<body>

	<div class="container">
		<!-- 		<div class="img"> -->
		<!-- 			<img src="img/Mobile_app_p3ts.svg"> -->
		<!-- 		</div> -->
		<div class="Cadastro-container">
			<form:form method="post" action="/save" modelAttribute="usuario">
				<!-- 				<img class="avatar" src="img/avatar.svg"> -->
				<h2>Bem vindo</h2>

				<div class="input-div one focus">
					<div class="i">
						<i class="fas fa-lock"></i>
					</div>
					<div>
						<h5>Nome</h5>
						<form:input path="nome" class="form-control" type="text" name="" />
					</div>
				</div>
				<div>
					<div>
						<h5>CPF</h5>
						<form:input path="cpf" class="form-control" type="text" name="" />
					</div>
				</div>
		</div>
		<div>
			<h5>Idade</h5>
			<form:input path="idade" class="form-control" type="text" name="" />
		</div>
	</div>
	<div>
		<h5>Senha</h5>
		<form:input path="senha" class="form-control" type="text" name="" />
	</div>



	<input type="submit" class="btn" value="Cadastrar" name="">
	</form:form>
	</div>
	</div>
	<script type="text/javascript" src="js/main.js"></script>
</body>
</html>