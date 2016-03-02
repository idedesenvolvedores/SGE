<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!--  

<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Sistema de registro de entrega">
        <title>Sistema de cadastro de registro</title>
        
        <script>
        
        function validarSenha(){
        	senha = document.f1.senha.value
        	confirmarSenha = document.f1.confirmarSenha.value
         
        	if (senha == confirmarSenha)
        		alert("SENHAS IGUAIS")
        	else
        		alert("SENHAS DIFERENTES")
        }	
        
        </script>
        
</head>

<body>


<div class="section">
	<c:import url="../menu/topo.jsp" />
</div>
<div class="col-md-12">

	<div class="col-md-4">
        	
		<c:import url="../menu/menuAdmin.jsp" />
	
	</div>
        

	<div class="col-md-8">
		<div class="section">
			<div class="col-md-7">
				<div style="text-align: center; color: red;"> ${mensagem} </div>
					<legend>Alterar Senha</legend>
					<form action="" class="form-horizontal" role="form" method="post">
						<div class="form-group">
			        		<div>
			                	<input type="hidden" class="form-control">
			                </div>			                          
							<div class="col-sm-2">
								<label for="inputText" class="control-label">Senha</label>
							</div>
							<div class="col-sm-10">
								<input type="password" class="form-control" id="senha" placeholder="Senha" name="senha">
							</div>
			             </div>
						<div class="form-group">
							<div class="col-sm-2">
								<label for="inputText" class="control-label">Confirmar Senha</label>
							</div>
							<div class="col-sm-10">
								<input type="password" class="form-control" placeholder="Confirmar Senha" name="confirmarSenha">
							</div>
	                     </div>
	                        
			       <div class="form-group">
			          <div class="col-sm-offset-2 col-sm-10">
			            <button type="reset" class="btn btn-danger">cancelar</button>&nbsp;&nbsp;&nbsp;
			          <button type="submit" class="btn btn-success" onClick="validarSenha()">salvar</button>
			       </div>
			     </div>			             
			   </form>
			  </div>
			</div>
		</div>
	</div>
	
    <div class="section" style="padding: 0; bottom:0; margin:0;	position:absolute; 	width:100%;">
		<c:import url="../menu/rodape.jsp" />
	</div>       	
   
-->

    <head>
    	<title>Validade Senha</title>
    <script> 

function validaSenha (input){ 
    if (input.value != document.getElementById('txtSenha').value) {
    input.setCustomValidity('Repita a senha corretamente');
  } else {
    input.setCustomValidity('');
  }
} 

   </script>
    </head>
     

    <body>



    <body>

<div class="section">
	<c:import url="../menu/topo.jsp" />
</div>
<div class="col-md-12">
	<!-- menu lateral -->
	<div class="col-md-3">
        	
		<c:import url="../menu/menuProfessor.jsp" />
	
	</div>
        
    <!-- tela -->
	<div class="col-md-8">
	
			 <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12"></div>
        </div>
        <div class="row">
          <div class="col-md-2"></div>
          <div class="col-md-8">
            <div class="jumbotron">
              <form class="form-horizontal" role="form" action="alterarUsuario">
              <input type="hidden" name="id">
              <input type="hidden" name="siapefk">
              <input type="hidden" name="area">
              <input type="hidden" name="id_tipo_usuario">
              
                <div class="form-group has-success">
                  <div class="col-sm-2">
                    <label for="login" class="control-label">Senha</label>
                  </div>
                  <div class="col-sm-10">
                    <input id="txtSenha" type="password" class="form-control input-lg" id="inputText" placeholder="Senha">
                  </div>
                </div>
                <div class="form-group has-success">
                  <div class="col-sm-2">
                    <label for="senha" class="control-label">Confirmar Senha</label>
                  </div>
                  <div class="col-sm-10">
                    <input id="repetir_senha" type="password" class="form-control input-lg" id="inputPassword3" placeholder="Confirmar Senha">
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-lg-10">
		              <input type="reset" value="Limpar" class="btn btn-danger">&nbsp; &nbsp;
        		      <input type="submit" value="Finalizar" class="btn btn-success">
                  </div>
                </div>
              </form>
            </div>
          </div>
          
        </div>
      </div>
    </div>
	
	</div>
</div>


</body>

</html>