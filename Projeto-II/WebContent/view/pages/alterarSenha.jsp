<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- topo -->

<!-- tela -->
<div class="col-md-8">
	<div class="section">
		<div class="col-md-7">
			<br>
			<br>
			<br>
			<h2 class="text-center">Atualizar dados</h2>
			<form class="form-horizontal" role="form" action="alterarDados"	method="post">
				<input type="hidden" name="id" value="${usuarioPreenchido.id}">
				<form:errors path="usuario.siape" cssStyle="color:red" />
				<form:errors path="usuario.nome" cssStyle="color:red" />
				<form:errors path="usuario.email" cssStyle="color:red" />
				<form:errors path="usuario.senha" cssStyle="color:red" />
				<div class="form-group">
					<div class="col-sm-2">
						<label for="inputNome3" class="control-label">Nome</label>
					</div>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="nome" name="nome" value="${usuarioPreenchido.nome}" placeholder="Nome" maxlength="100">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-2">
						<label for="inputEmail" class="control-label">Email</label>
					</div>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail"
							name="email" value="${usuarioPreenchido.email}" maxlength="100"
							placeholder="Email">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-2">
						<label for="inputSenha" class="control-label">Senha</label>
					</div>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="inputText"	name="senha" value="${usuarioPreenchido.senha}" placeholder="Senha" maxlength="100">
					</div>
				</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<!--  <a class="btn btn-warning" href="exibirIndexAdm">Voltar</a>-->
				&nbsp;&nbsp;&nbsp;
				<button type="submit" class="btn btn-success">alterar</button>
			</div>
		</div>
		</form>
	</div>
</div>
