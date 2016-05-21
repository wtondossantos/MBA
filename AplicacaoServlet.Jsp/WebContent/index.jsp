<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="/style/style.css">
		<style>
			label,input{margin:0 10px 10px; width:auto}
			input{padding:2px 7px}
			form{width:200px;height:130px;margin: 100px auto;border:1px #ddd solid;padding:10px}
			input[type="submit"]{width:100px;float:right}
		</style>
	</head>
<body>
	<header>
		<figure>
			<a href="#" title="Início" class="logo">Imagem</a>
		</figure>
	</header>
	<section>
		<h1>Validação de usuário</h1>
		<form action="valida" method="post">
			<label for="txtUsuario">Usuário</label>
			<input type="text" name="txtUsuario" id="txtUsuario" size="20"/>
			<label for="pwdSenha">Senha</label>
			<input type="password" name="pwdSenha" id="pswSenha" size="20"/>
			<input type="submit" value="Validar"/>
		</form>
	</section>
	<footer>
		<p>Footer</p>
	</footer>
</body>
</html>