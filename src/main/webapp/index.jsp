<%@page pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
    <link href="assets/css/bootstrap-united.css" rel="stylesheet" />
    <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" />
    <style>
        body {
            height: 100%;
            margin: 0;
            background: url(assets/img/books.jpg);

            background-repeat: no-repeat;
            background-size: 100%;
            display: compact;
        }
    </style>
</head>
<body>
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
            <input type="text" class="form-control" placeholder="Search">
        </form>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#">Главная</a></li>
            <li><a href="signup.html">Регистрация</a></li>
            <li><a href="login.html">Войти</a></li>
            <li class="dropdown"><a href="#" class="dropdown-toggle"
                                    data-toggle="dropdown">Дополнительно<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Контакты</a></li>
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
            <p>Для начала зарегистрируйтесь.
                Или войдите используя свои учетные данные.</p>
        </div>

        <a class="btn btn-primary" href="signup.html">Регистрация </a> <a
            class="btn btn-primary" href="login.html">Вход </a>
    </div>

    <div></div>
</div>
<script src="jquery-1.8.3.js">
</script>

<script src="bootstrap/js/bootstrap.js">
</script>

</body>
</html>
