<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	      	<div class="col-md-12">
	      	<div style="text-align: center; color: red;"> ${mensagem} </div>
				<h2 class="text-center">Listagem de usuarios cadastrados</h2>
			    <br><br><br>
			   <table class="table">
					<thead>
						<tr>
							<th>Nome</th>
							<th>SIAPE</th>
							<th>Email</th>
							<th>Tipo</th>
							<th>&nbsp;&nbsp;Ações</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="user" items="${listaUsuario}">
							<tr>

								<td>${user.pessoa.nome }</td>
								<td>${user.pessoa.siape}</td>
								<td>${user.pessoa.email}</td>
								<td>${user.tipoUsuario.descricao}</td>
								<td>
									<div class="col-md-4">
										<a class="btn btn-warning"
											href="exibirAlterarUsuario?siape=${user.pessoa.siape}">editar</a>
									</div>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<div class="col-md-4">
										<a class="btn btn-danger"
										
											href="removerUsuario?id=${user.id}">Remover</a>
									</div>

								</td>

							</tr>
						</c:forEach>

					</tbody>
				</table>
				<div class="col-md">
					<a class="btn btn-success" href="exibirIncluirUsuario">Voltar</a>
				</div>
			</div>
			   
		</div>
	</div>
</div>
	</div>   