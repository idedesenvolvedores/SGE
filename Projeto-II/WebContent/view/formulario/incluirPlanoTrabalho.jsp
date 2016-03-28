<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- topo -->
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
				<div style="text-align: center; color: red;">${mensagem}</div>
				<br>

				<form action="incluirPlanoTrabalho" class="form-horizontal"
					role="form" method="post">

					<form:errors path="planoTrabalho.atividadeApoio"
						cssStyle="color:red" />
					<br>

					<form:errors path="planoTrabalho.atividadePesquisa"
						cssStyle="color:red" />
					<br>

					<form:errors path="planoTrabalho.atividadeExtensao"
						cssStyle="color:red" />
					<br>

					<div class="row">
						<legend>ATIVIDADES DE APOIO AO ENSINO</legend>
					</div>

					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<div class="col-md-12">
									<textarea class="form-control" id="atividadeApoio"
										name="atividadeApoio" placeholder="Digite o texto..."></textarea>
								</div>
							</div>
						</div>
					</div>
					<br> <br>

					<div class="row">
						<legend>ATIVIDADES DE PESQUISA, PÓS-GRADUAÇÃO E INOVAÇÃO</legend>
					</div>

					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<div class="col-md-12">
									<textarea class="form-control" id="atividadePesquisa"
										name="atividadePesquisa" placeholder="Digite o texto..."></textarea>
								</div>
							</div>
						</div>
					</div>

					<br> <br>

					<div class="row">
						<legend>ATIVIDADES DE EXTENSÃO</legend>
					</div>

					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<div class="col-md-12">
									<textarea class="form-control" id="atividadeExtensao"
										name="atividadeExtensao" placeholder="Digite o texto..."></textarea>
								</div>
							</div>
						</div>
					</div>
					<!--
					não descomente isso!
					<div>
						  <input type="hidden" name="siapePessoa" id="siapePessoa"
							value="${usuarioLogado.pessoa.siape}"> <br>
					</div>-->

					<div class="form-group" align="center">
						<div class="col-md-12">
							<button type="reset" class="btn btn-danger">Limpar</button>
							&nbsp;&nbsp;&nbsp;
							<button type="submit" class="btn btn-success">Finalizar</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>