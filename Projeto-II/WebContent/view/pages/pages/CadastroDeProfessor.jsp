<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> -->
<div class="section">
	<c:import url="../menu/topo.jsp" />
</div>
<div class="col-md-12">
        <!-- menu lateral -->
        <div class="col-md-4">
        	<c:import url="../menu/menuAdmin.jsp" />
        </div>


<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12"></div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
           
              <div class="section">
                <div class="container">
                  <div class="row">
                    <div class="col-md-5"></div>
                    <div class="col-md-6">
                      <h2 class="text-center">Cadastro de Professor</h2>
                      
                      <form class="form-horizontal" role="form" action="salvarProfessor" method="post">
                        <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputNome3" class="control-label">Nome</label>
                          </div>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome">
                          </div>
                        </div>
                        <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputSiape" class="control-label">Siape</label>
                          </div>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPassword3" name="siape" placeholder="Siape">
                          </div>
                        </div>
                        <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputEmail" class="control-label">Email</label>
                          </div>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPassword3" name="email" placeholder="Email">
                          </div>
                        </div>
                        
                        
                       
                        
                        
                        <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputSenha" class="control-label">Senha</label>
                          </div>
                          <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" name="senha" placeholder="Senha">
                          </div>
                        </div>
                        <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputPassword3" class="control-label">Confimar senha</label>
                          </div>
                          <div class="col-sm-10">
                           <input type="password" class="form-control" id="inputPassword3" placeholder="Confimar senha">
                          </div>
                        </div>
                        <div class="form-group">
                          <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-danger">cancelar</button>
                            &nbsp;&nbsp;&nbsp;
                            <button type="submit" class="btn btn-success">cadastrar</button>
                          </div>
                        </div>
                        <div class="form-group"></div>
                      </form>
                    </div>
                    <div class="col-md-1"></div>
                  </div>
                </div>
              </div>
  
          </div>
        </div>
      </div>
    </div>
    </div>
<!-- 
</body>
</html>
-->