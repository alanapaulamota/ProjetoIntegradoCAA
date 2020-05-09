<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>

<title>Pagina de Cadastro</title>
<!-- CSS - ADICIONAR BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1"
	charset="utf-8">
</head>

<header>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
     <a class="navbar-brand" href="usuario">Cadastro</a>

     <ul class="navbar-nav">
<!--          <li class="nav-item active"> -->
<!--              <a class="nav-link" href="#">Sobre</a> -->
<!--          </li> -->
         <li class="nav-item">
             <a class="nav-link" href="#">Ajuda</a>
         </li>
         <li class="nav-item">
             <a class="nav-link" href="#">Perguntas frequentes</a>
         </li>
         <li class="nav-item">
             <a class="nav-link" href="#">Entre em contato</a>
         </li>
     </ul>
 </nav>


</header>
<body>
	<div class="container" style="padding-top: 80px;">
		<div class="row">
			<div class="col-md-6" style="padding-top: 150px;">
				<img src="/images/Mobile1.svg" class="img-fluid"
					alt="Imagem responsiva">
			</div>

			<div class="col-md-6 ">

				<div class="col-md-12">
					<img src="/images/avatar.svg" alt="avatar" style="width: 25%">
					<br> <br>
					<h1>Bem-vindo!</h1>
					<br>
				</div>

				<form class="form-horizontal " method="post" action="/saveUsuario"
					role="form">
					<div class="form-group">
						<label for="nome" class="col-sm-6 control-label ">Nome</label>
						<div class="col-sm-7">
							<input type="text" required class="form-control" id="nome"
								name="nome" min="1" max="255"
								pattern="[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$"
								title="nome não deve ter números"
								placeholder="Digite aqui seu nome completo" />
						</div>


					</div>
					<div class="form-group">
						<label for="idade" class="col-sm-7 control-label">Idade</label>
						<div class="col-sm-7">
							<input type="number" required class="form-control" id="idade"
								name="idade" min="1" placeholder="Digite aqui sua idade" />
						</div>
					</div>

					<div class="form-group">
						<label for="cpf" class="col-sm-7 control-label">CPF</label>
						<div class="col-sm-7">
							<input type="text" required class="form-control" id="cpf"
								name="cpf" min="11" max="11"
								pattern="^(\d{3}\.\d{3}\.\d{3}-\d{2})|(\d{11})$"
								placeholder="Digite aqui seu CPF" />
						</div>
					</div>

					<div class="form-group">
						<label for="senha" class="col-sm-7 control-label">Senha</label>
						<div class="col-sm-7">
							<input type="password" required id="senha" class="form-control"
								name="senha" placeholder="Digite aqui sua senha" />
						</div>
					</div>

					<a href="/login">Já Sou Cadastrado</a><br> <br>
					<div class="form-group">
						<div class="col-sm-offset-6 col-sm-10">
							<button type="submit" class="btn btn-success btn-block ">Cadastrar</button>
						</div>
					</div>
				</form>
				<!-- 					<img src="img/avatar_login.svg" class="img-responsive pull-left " -->
				<!-- 						width="50px"> -->
			</div>
		</div>

	</div>

	<script type="text/javascript" src="js/main.js"></script>
</body>
</html>