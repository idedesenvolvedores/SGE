<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

	<div style="text-align: center; color: red;"> ${mensagem} </div>

	<hr>
	<h3>Atividade Pedagógica</h3>
	<hr>
	
	<table border='1' style='width: 100%;'>
		<tr style='background-color: #E6E6E6; font-weight: bold;'>
			<td> ID </td>
			<td> ATIVIDADE </td>
			<td> PORTARIA </td>
			<td> AÇÕES </td>
		</tr>

	<c:forEach var="listaAtividadePedagogica" items="${listaAtividadePedagogica}">
		<tr>
	    	<td> ${listaAtividadePedagogica.id} </td>
	    	<td> ${listaAtividadePedagogica.atividade} </td>
	    	<td> ${listaAtividadePedagogica.portaria} </td>
	    	<td>
	    		<a href="removerAtividadePedagogica?id=${listaAtividadeEnsino.id}">Remover</a>
	    	</td>
	    </tr>
	</c:forEach>
	</table>


<c:import url="../menu/menuProfessor.jsp" />