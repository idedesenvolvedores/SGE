
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


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
            <legend>ATIVIDADES DE ENSINO (AULAS)</legend>
            <div class="panel panel-success">
              <div class="panel-heading">
                <a href="exibirIncluirAtividadeEnsino" class="btn btn-info btn-sm">
          		<span class="glyphicon glyphicon-plus"></span> Adicionar
        	</a>
              </div>
            </div>
		

		<br>
				<div style="text-align: center; color: red;"> ${mensagem} </div>
		<br>

            <!-- Table -->
            <table class="table table-hover" style="">
              <thead>
                <tr style="background-color:#D8D8D8">
                  <th style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" class="text-center;">ID</th>
                  <th style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" class="text-center">DISCIPLINAS / COMPONENTES CURRICULARES</th>
                  <th style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" class="text-center">CURSO</th>
                  <th style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" class="text-center">CARGA HORÁRIA</th>
                  <th style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" class="text-center">ALTERAR / REMOVER</th>
                </tr>
              </thead>
              <tbody>
                
                <c:forEach var="listaAtividadeEnsino" items="${listaAtividadeEnsino}">
                <tr>
                  <td style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;">${listaAtividadeEnsino.id}</td>
                  <td align="justify" style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;">${listaAtividadeEnsino.disciplina}</td>
                  <td style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" align="justify">${listaAtividadeEnsino.curso}</td>
                  <td style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" align="justify">${listaAtividadeEnsino.cargaHoraria}</td>
                  <td style="border: 2px solid; border-color:#E6E6E6;vertical-align: middle;" align="center">
                    <a href="exibirAlterarAtividadeEnsino?id=${listaAtividadeEnsino.id}" class="btn btn-info btn-xs">
          <span class="glyphicon glyphicon-remove"></span> Editar
        </a>&nbsp;&nbsp;
                    <a href="removerAtividadeEnsino?id=${listaAtividadeEnsino.id}" class="btn btn-info btn-xs">
          <span class="glyphicon glyphicon-remove"></span> Remover
        </a>
                  </td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
