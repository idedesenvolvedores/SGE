<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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


<c:import url="../menu/menuProfessor.jsp" />