<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>База данных автомобильных номеров</title>
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" />
<link href="/pop-up/css/style.css" rel="stylesheet" />
<link href="/pop-up/css/reset.css" rel="stylesheet" />
<link href="/pop-up/css/foundation.css" rel="stylesheet" />
<style>
body {
	width: 100%;
	height: 100%;
	margin: 0;
	background: url(assets/img/Jakimi.jpg);
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>

	<div class="row pop-up">
		<div class="box small-6 large-centered">
			<a href="#" class="close-button">&#10006;</a>
			<h3>Добро пожаловать!</h3>
			<p></p>
			<p>Данный ресурс создан исключительно для учебных целей.</p>
			<p>Владельцы ресурса не несут ответственность за информацию размещенную в базе. Все данные являются вымышленными, любое совпадение с реально существующими номерами и автомобилями случайно. Использование и размещение данных остается на усмотрение пользователей. Никто не проверяет и специально не поддерживает информацию в актуальном состоянии.</p>
			<p><img src="/pop-up/css/galka.png"></p>
			<p> <br> </p>
		</div>
	</div>

	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Поиск">
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="/">Главная</a></li>
				<li><a href="signup.html">Регистрация</a></li>
				<li><a href="login.html">Вход</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Дополнительно<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="contact.html">Контакты</a></li>
						<li class="divider"></li>
						<li><a href="#">О проекте</a></li>
					</ul></li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
	</div>
	<div class="container">
		<div class="jumbotron">
			<div>
				<h1>Добро пожаловать в базу данных автомобилей!</h1>
				<p>Для продолжении работы с базой необходимо зарегистрироваться.
					Для входа используйте данные, указанные при регистрации.</p>
			</div>

			<a class="btn btn-primary" href="signup.html">Регистрация </a> <a
				class="btn btn-primary" href="login.html">Вход </a>
		</div>

		<div></div>
	</div>

	<script src="jquery-1.8.3.js">	</script>

	<script src="bootstrap/js/bootstrap.js"></script>

	<script src="/pop-up/js/index.js"></script>

<script>
    $('.pop-up').hide();
    $('.pop-up').fadeIn(1000);
</script>

</body>
</html>
