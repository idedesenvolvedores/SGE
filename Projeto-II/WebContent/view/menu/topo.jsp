<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="Sistema de registro de entrega">
<title>Sistema de cadastro de registro</title>

<!-- jQuery -->
<script src="./view/bootstrap/js/jquery.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="./view/bootstrap/js/bootstrap.min.js"></script>
<!-- Bootstrap Core CSS -->
<link href="./view/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- este CSS foi tirado de um template -->
<link href="./view/bootstrap/css/sb-admin.css" rel="stylesheet">
<!-- Fonts -->
<link href="./view/bootstrap/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media
        queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file://
        -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>
<body>
<body style="background-color: #D3D3D3">
	<div id="wrapper">
		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"
			style="background-color: #359135; color: #FFFFFF"> <!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Navegação</span> <span class="icon-bar"></span>
				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="exibirHome" style="color: #FFFFFF">IFPE
				- S.G.E V1.0</a>
		</div>
		<!-- Top Menu Items -->
		<ul class="nav navbar-right top-nav"
			style="background-color: #359135; color: #FFFFFF">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"
				style="background-color: #359135; color: #FFFFFF"><i class="fa fa-lg fa-user"></i>
				${usuarioLogado.nome}
				<b class="caret"></b></a>
				<ul class="dropdown-menu"
					style="background-color: #359135; color: #FFFFFF">
					<li><a href="exibirAlterarUsuario?id=${usuarioLogado.id}" style="background-color: #359135; color: #FFFFFF"><i class="fa fa-fw fa-gear fa-lg"></i> conta </a></li>
					<li class="divider"></li>
					<li><a href="logout"style="background-color: #359135; color: #FFFFFF"><i class="fa fa-fw fa-lg fa-power-off"></i> sair </a></li>
				</ul></li>
		</ul>
		</nav>
	</div>
</body>
</html>