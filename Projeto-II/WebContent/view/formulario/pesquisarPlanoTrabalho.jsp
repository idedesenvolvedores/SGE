<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
			<div class="col-md-12">
				<br>
				<legend>PLANO DE TRABALHO</legend>
				<br>
				<div style="text-align: center; color: red;">${mensagem}</div>
				<br>

				<table class="table">
					<thead>
						<tr>
							<th class="active">SELECIONAR</th>
							<th class="active">ATIVIDADES DE APOIO AO ENSINO</th>
							<th class="active">ATIVIDADES DE PESQUISA, PÓS-GRADUAÇÃO E
								INOVAÇÃO</th>
							<th class="active">ATIVIDADES DE EXTENSÃO</th>
							<th class="active">EDITAR</th>
							<th class="active">REMOVER</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="listaPlanoTrabalho" items="${listaPlanoTrabalho}">
							<tr>
								<td class="active"><a class="btn btn-info" href="exibirIncluirAtividadeEnsino?id=${listaPlanoTrabalho.id}">SELECIONAR</a></td>
								<td class="active">${listaPlanoTrabalho.atividadeApoio}</td>
								<td class="active">${listaPlanoTrabalho.atividadePesquisa}</td>
								<td class="active">${listaPlanoTrabalho.atividadeExtensao}</td>
								<td class="active"><a class="btn btn-warning"
									href="exibirAlterarPlanoTrabalho?id=${listaPlanoTrabalho.id}">editar</a>
								</td>
								<td class="active"><a class="btn btn-danger"
									href="removerPlanoTrabalho?id=${listaPlanoTrabalho.id}">remover</a>
								</td>
							</tr>
							<tr>

							</tr>
							<tr></tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
