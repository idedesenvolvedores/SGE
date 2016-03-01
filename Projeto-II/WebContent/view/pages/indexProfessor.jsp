<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="section">
	<c:import url="../menu/topo.jsp" />
</div>
<div class="col-md-12">
	<!-- menu lateral -->
	<div class="col-md-3">
        	
		<c:import url="../menu/menuProfessor.jsp" />
	
	</div>

	<div class="col-md-8">


		    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <table class="table">
              <thead>
                <tr></tr>
              </thead>
              <tbody>
                <tr>
                  <td>
                    <a href="exibirIncluirCabecalho" class="btn btn-block btn-lg btn-success" style="padding:50; font-size:250%"><spam>Editar perfil</spam></a>
                  </td>
                  <td>
                    <a href="alterarSenha" class="btn btn-block btn-lg btn-success" style="padding:50; font-size:250%">
                      <spam>Alterar Senha</spam></a>
                  </td>
                </tr>
                <tr>
                  <td>
                    <a href="exibirIncluirPlanoTrabalho" class="btn btn-block btn-lg btn-success" style="padding:50; font-size:250%"><spam>Plano de Trabalho</spam></a>
                  </td>
                  <td>
                    <a href="exibirIncluirAtividadeEnsino" class="btn btn-block btn-lg btn-success" style="padding:50; font-size:250%"><spam>Atividade de Ensino(Aulas)</spam></a>
                  </td>
                </tr>
                <tr>
                  <td>
                    <a href="exibirIncluirAtividadePedagogica" class="btn btn-block btn-lg btn-success" style="padding:50; font-size:250%"><spam>Atividades pedagogicas</spam></a>
                  </td>
                  <td>
                    <a href="#" class="btn btn-block btn-lg btn-success" style="padding:50; font-size:250%">
                      <spam>Imprimir formulário</spam></a>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
</div>
	
	</div>
