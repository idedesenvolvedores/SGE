<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- 

	<div style="text-align: center; color: red;"> ${mensagem} </div>

	<hr>
	<h3>Atividade de Ensino</h3>
	<hr>
	
	<table border='1' style='width: 100%;'>
		<tr style='background-color: #E6E6E6; font-weight: bold;'>
			<td> ID </td>
			<td> DISCIPLINA </td>
			<td> CURSO </td>
			<td> CARGA HORÁRIA </td>
			<td> AÇÕES </td>
		</tr>

	<c:forEach var="listaAtividadeEnsino" items="${listaAtividadeEnsino}">
		<tr>
	    	<td> ${listaAtividadeEnsino.id} </td>
	    	<td> ${listaAtividadeEnsino.disciplina} </td>
	    	<td> ${listaAtividadeEnsino.curso} </td>
	    	<td> ${listaAtividadeEnsino.cargaHoraria} </td>
	    	<td>
	    		<a href="exibirAlterarAtividadeEnsino?id=${listaAtividadeEnsino.id}">Editar</a>
	    		<a href="removerAtividadeEnsino?id=${listaAtividadeEnsino.id}">Remover</a>
	    	</td>
	    </tr>
	</c:forEach>
	</table>


 -->

<c:import url="/view/comum/menu.jsp" />

	<div style="color: red;" align="center"> <h3> ${msg} </h3> </div>

	<hr>
	<h3>Pesquisar Produto</h3>
	<hr>
	
	<table border='1' style='width: 100%;'>
		<tr style='background-color: #E6E6E6; font-weight: bold;'>
			<td> ID </td>
			<td> CAMPUS </td>
			<td> DIRETORIA </td>
			<td> PROFESSOR </td>
			<td> MATRÍCULA SIAPE Nº </td>
			<td> EMAIL </td>
			<td> TELEFONE </td>
			<td> ÁREA DE CONHECIMENTO </td>
			<td> CLASSE (ART. 1°) </td>
			<td> REGIME DE TRABALHO </td>
			<td> AÇÕES </td>
		</tr>
	
	<c:forEach var="p" items="${listaPessoa}">
		<tr>
	    	<td> ${p.id} </td>
	    	<td> ${p.campus} </td>
	    	<td> ${p.diretoria} </td>
	    	<td> ${p.professor} </td>
	    	<td> ${p.matricula} </td>
	    	<td> ${p.email} </td>
	    	<td> ${p.telefone} </td>
	    	<td> ${p.area}  </td>
	    	<td> ${p.classe} </td>
	    	<td> ${p.regime} </td>
	    	<td>
	    		<a href='exibirAlterarPessoa?id=${p.id}'>Editar</a>
	    	</td>
	    </tr>
	</c:forEach>
	</table>