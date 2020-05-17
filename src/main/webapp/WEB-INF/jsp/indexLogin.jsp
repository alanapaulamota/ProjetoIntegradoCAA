<!DOCTYPE html>
<html>
<head>
<title>CONECTE-SE</title>
<meta name="viewport" content="width=device-width, initial-scale=1"
	charset="utf-8">
<!--link de custumização do html-->
<link rel="stylesheet" type="text/css" href="css/styleLogin.css">
<!--link google fonts-->
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap"
	rel="stylesheet">
<!--link do owl carousel-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"
	integrity="sha256-UhQQ4fxEeABh4JrcmAJ1+16id/1dnlOEVCFOxDef9Lw="
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.theme.default.min.css"
	integrity="sha256-kksNxjDRxd/5+jGurZUJd1sdR2v+ClrCl3svESBaJqw="
	crossorigin="anonymous" />
<!--Fonte do Awesome-->
<script src="https://kit.fontawesome.com/a81368914c.js"></script>
</head>
<body>
	<!--<img class="fundo" src="img/fundo-gradiente2.png">-->
	<div class="container">
		<div class="img carousel">
			<!--<img src="img/connection.svg">
			<img src="img/Mobileapp.svg">
			<img src="img/insync.svg">
			<img src="img/mobileapps.svg">
			<img src="img/mobileDevices.svg">-->
		</div>
		<div class="login-container">
			<form action="indexLogin">
				<!--<img class="avatar" src="img/avatar.svg">-->
				<img class="sedf" src="img/sedef.jpg">
				<h3>Secretária da Educação</h3>
				<h6>Digite ou fale as informações abaixo</h6>
				<h2>Para continuar</h2>
				<div class="input-div one">
					<div class="i">
						<i class="fas fa-user"></i>
					</div>
					<div>
						<h5>Digite ou fale seu CPF</h5>
					<input class="input" type="text" name="cpf"
							pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"><i
							class="fas fa-microphone fa-pull-right"></i>
					</div>
				</div>
				<div class="input-div four">
					<div class="i">
						<i class="fas fa-user-lock"></i>
					</div>
					<div>
						<h5>Digite ou fale sua senha</h5>
						<input class="input" type="password" name="senha"
							pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
							title="Digite uma senha valiad"><i
							class="fas fa-microphone fa-pull-right"></i>
					</div>
				</div>
				<div class="title">
					<a href="/indexRecuperarSenha" class="a">Esqueceu a senha?</a>
					<!-- <input formaction="file:///C:/Users/PC/Documents/5º%20Semestre/Projeto%20Integrado/CAA/PaginaInicial/indexPginicial.html" type="submit" class="btn" value="Cadastrar" name=""> -->
					<div class="form-group">
						<div class="col-sm-offset-6 col-sm-10">
							<button type="submit" class="btn btn-success btn-block ">Conectar</button>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<!--script do owl carousel-->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"
		integrity="sha256-pTxD+DSzIwmwhOqTFN+DB+nHjO4iAsbgfyFq5K5bcE0="
		crossorigin="anonymous"></script>

	<!--<script >
    	$(document).ready(function(){
    		$('.owl-carousel').owlCarousel({
    			loop: true,
    			autoplay: true,
    			autoplayTimeout: 2000,
    			autoplayHoverPause: true,
    			items: 1
    		});
    	});
    </script>-->

	<script type="text/javascript" src="js/main.js"></script>

</body>
</html>