<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
 <!-- jQuery -->
        <script src="./view/bootstrap/js/jquery.js"></script>
        <!-- Bootstrap Core JavaScript -->
        <script src="./view/bootstrap/js/bootstrap.min.js"></script>
        <!-- Bootstrap Core CSS -->
        <link href="./view/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- este CSS foi tirado de um template -->
        <link href="./view/bootstrap/css/sb-admin.css" rel="stylesheet">
        <!-- Fonts -->
        <link href="./view/bootstrap/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
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
	 <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12"></div>
        </div>
        <div class="row">
          <div class="col-md-2"></div>
          <div class="col-md-8">
            <div class="jumbotron">
              <form class="form-horizontal" role="form" action="efetuarLogin" method="post">
                <div class="container">
                  <div class="col-sm-2">
                    <img src="./view/imagens/logoif.png" class="img-responsive">
                  </div>
                </div>
                <br>
                <div class="form-group has-success">
                  <div class="col-sm-2">
                    <label for="login" class="control-label">
                      <h3>Siape</h3>
                    </label>
                  </div>
                  <div class="col-sm-10">
                    <input type="text" class="form-control input-lg" id="inputText" name="siape" placeholder="siape" required="required">
                  </div>
                </div>
                <div class="form-group has-success">
                  <div class="col-sm-2">
                    <label for="senha" class="control-label">
                      <h3>Senha</h3>
                    </label>
                  </div>
                  <div class="col-sm-10">
                    <input type="password" class="form-control input-lg" id="inputPassword3" name="senha" placeholder="senha" required="required">
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-lg btn-success">Entrar</button>
                  </div>
                </div>
              </form>
            </div>
          </div>
          <div class="col-md-2"></div>
        </div>
      </div>
    </div>
</body>
</html>