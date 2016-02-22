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
				<h2 class="text-center">Registro de Entrega</h2>
			    	<form action="salvarRegistro" class="form-horizontal" role="form" method="post">
			        	<div class="form-group">
			        		<div>
			                	<input type="hidden" class="form-control">
			                </div>			                          
			                <div class="col-sm-2">
			                	<label for="inputText" class="control-label">Nome</label>
			             	</div>
			                <div class="col-sm-10">
			                	<input type="text" class="form-control" id="nome" placeholder="Nome" name="nome">
			                </div>
			             </div>
			             <div class="form-group">
	                          <div class="col-sm-2">
	                            <label for="inputText" class="control-label">Siape</label>
	                          </div>
	                          <div class="col-sm-10">
	                            <input type="text" class="form-control" id="siape" placeholder="Siape" name="siape">
	                          </div>
	                     </div>
	                        
	                        
                         <div class="form-group">
                          <div class="col-sm-2">
                            <label for="sel1" class="control-label">Semestre</label>
                          </div>
                          <div class="col-sm-10">
                            <select type="text" class="form-control" id="sel1" placeholder="Semestre" name="semestre">
                          		<option> primeiro </option >
                          		<option> segundo </option >
                          	</select>
                          </div>
                         </div>
	                        
                      	<div class="form-group">
                          <div class="col-sm-4">
                            <label for="inputText" class="control-label">Data de entrega</label>
                          </div>
                          <div class="col-sm-8">
                            <input type="text" class="form-control" id="data" placeholder="Data de entrega" name="dataEntrega">
                          </div>
                        </div>
	                        
			       <div class="form-group">
			          <div class="col-sm-offset-2 col-sm-10">
			            <button type="reset" class="btn btn-danger">cancelar</button>&nbsp;&nbsp;&nbsp;
			          <button type="submit" class="btn btn-success">salvar</button>
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
   