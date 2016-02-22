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
        <!-- tela -->
<div class="col-md-8">
<div class="section">
    <div class="col-md-7">
             <hr>
              <h3 contenteditable="true"  align="center">Lista de entregas</h3>
    
              <table class="table">
                <thead>
                  <tr>
                    <th>Nome</th>
                    <th>SIAPE</th>
                    <th>Semestre</th>
                    <th>Data de entrega</th>
                    <th> &nbsp;&nbsp;Ações</th> 	
                  </tr>
                </thead>
                <tbody >
    
                <c:forEach var="registro" items="${listaRegistro}">
                  <tr>
                 
                    <td>${registro.nome }</td>
                    <td>${registro.siape}</td>
                    <td>${registro.semestre}</td>
                    <td>${registro.dataEntrega}</td>
                    <td>
                    <div class="col-md-4">
              			<a class="btn btn-warning" href="exibirAlterarRegistro?id=${registro.id}">editar</a>
            		</div>
            		</td>
                    
                  </tr>
                 </c:forEach>  
                          
                </tbody>
              </table>
              <div class="col-md">
              <a class="btn btn-success" href="RegistroDeEntrga">Voltar</a> 
            </div>
            </div>
           
            
           
          </div>
        </div>
      </div>
    
<div class="section" style="padding: 0; bottom:0; margin:0;	position:absolute; 	width:100%;">
	<c:import url="../menu/rodape.jsp" />
</div>  