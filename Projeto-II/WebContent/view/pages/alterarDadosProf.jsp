<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- topo -->
<div class="section">
	<c:import url="../menu/topo.jsp" />
</div>
      <div class="col-md-12">
      
        <!-- menu lateral -->
        <div class="col-md-4">
        	<c:import url="../menu/menuAdmin.jsp" />
	    </div>
	    
	        <!-- tela -->
	        <div class="col-md-8">
	       	<div class="section">
	      	 <div class="col-md-7">
	      	 <br><br><br>
	          <h2 class="text-center">Atualizar dados</h2>
	           <form class="form-horizontal" role="form" action="alterarProfessor" method="post">
	            <div class="form-group">
	            <input type="hidden" name="id" value="${usuarioPreenchido.id}">
	            <input type="hidden" name="senha" value="${usuarioPreenchido.senha}">
	              <div class="col-sm-2">
	                <label for="inputNome3" class="control-label">Nome</label>
	              </div>
	              <div class="col-sm-10">
	                <input type="text" class="form-control" id="nome" name="nome" value="${usuarioPreenchido.nome}" placeholder="Nome">
	              </div>
	            </div>
	             <div class="form-group">
	              <div class="col-sm-2">
	                <label for="inputEmail" class="control-label">Email</label>
	              </div>
	              <div class="col-sm-10">
	                <input type="text" class="form-control" id="inputEmail" name="email" value="${usuarioPreenchido.email}" placeholder="Email">
	              </div>
	            </div>
	            </div>
	            <div class="form-group">
	              <div class="col-sm-offset-2 col-sm-10">
	                <a class="btn btn-warning" href="exibirIndexAdm">Voltar</a>
	                &nbsp;&nbsp;&nbsp;
	                <button type="submit" class="btn btn-success">alterar</button>
	              </div>
	            </div>
	            <div class="form-group"></div>
	          </form>
	        </div> 
	    </div>
	</div>
</div>