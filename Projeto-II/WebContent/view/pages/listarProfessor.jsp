<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

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
          <div class="col-md-3"></div>
          <div class="col-md-9">
    
              
              <h3 contenteditable="true">Professores Cadastrados</h3>
              <hr>
              <table class="table">
                <thead>
                  <tr>
                    <th>Nome</th>
                    <th>SIAPE</th>
                    <th>email</th>
                    <th>Telefone</th>
                 <th> ID </th>
                 <th> AÇÕES </th>
                 
                 
                  </tr>
                </thead>
              
             <c:forEach var="professor" items="${listaProfessor}">
                 <tr>
					<td> ${professor.nome} </td>
					<td> ${professor.siape} </td>
					<td> ${professor.email} </td>
					<td> ${professor.telefone} </td>
					<td> ${professor.id} </td>
					<td>
	    				<a href="exibirAlterarProfessor?id=${professor.id}">Editar</a>
			    		<a href="removerProfessor?id=${professor.id}">Remover</a>
			    	</td>
				</tr>
			</c:forEach>

               
              </table>
          
           <div class="col-md-2">
              <a class="btn btn-success">Voltar</a>
           </div>
          </div>
        </div>
      </div>
    </div>
    </div>
  




