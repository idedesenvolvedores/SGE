
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="section">
	<c:import url="../menu/topo.jsp" />
</div>
<!--  <c:import url="../menu/menuProfessor.jsp" /> -->


<div class="col-md-12">
	<!-- menu lateral -->
	<div class="col-md-4">
	<c:import url="../menu/menuProfessor.jsp" />
	
	</div>
	<!-- tela -->
	<div class="col-md-8">
		<div class="section">
			<div class="col-md-12">
				<hr>
				<div style="text-align: center; color: red;">${mensagem}</div>
				<h3 contenteditable="true" align="center">Atividade de Ensino</h3>

				<table class="table">
					<thead>
						<tr>
							<th>ID</th>
							<th>DISCIPLINA</th>
							<th>CURSO</th>
							<th>CARGA HORÁRIA</th>
							<th>&nbsp;&nbsp; AÇÕES</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="listaAtividadeEnsino" items="${listaAtividadeEnsino}">
							<tr>

								<td>${listaAtividadeEnsino.id}</td>
								<td>${listaAtividadeEnsino.disciplina}</td>
								<td>${listaAtividadeEnsino.curso}</td>
								<td>${listaAtividadeEnsino.cargaHoraria}</td>
								<td>
									<div class="col-md-4">
										<a href="exibirAlterarAtividadeEnsino?id=${listaAtividadeEnsino.id}">Editar</a>
									</div>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<div class="col-md-4">
							    		<a href="removerAtividadeEnsino?id=${listaAtividadeEnsino.id}">Remover</a>
									</div>

								</td>

							</tr>
						</c:forEach>

					</tbody>
				</table>
				<div class="col-md">
					<a class="btn btn-success" href="exibirIncluirAtividadeEnsino">Voltar</a>
				</div>
			</div>
		</div>
	</div>
</div>