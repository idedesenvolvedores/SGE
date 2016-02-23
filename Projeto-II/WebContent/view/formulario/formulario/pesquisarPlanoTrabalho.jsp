<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<div style="text-align: center; color: red;"> ${mensagem} </div>

	<hr>
	<h3>Plano de Trabalho</h3>
	<hr>
	
	<table border='1' style='width: 100%;'>
		<tr style='background-color: #E6E6E6; font-weight: bold;'>
			<td> ID </td>
			<td> ATIVIDADE DE APOIO </td>
			<td> ATIVIDADE DE PESQUISA </td>
			<td> CARGA DE EXTENSÃO </td>
			<td> AÇÕES </td>
		</tr>

	<c:forEach var="listaPlanoTrabalho" items="${listaPlanoTrabalho}">
		<tr>
	    	<td> ${listaPlanoTrabalho.id} </td>
	    	<td> ${listaPlanoTrabalho.atividadeApoio} </td>
	    	<td> ${listaPlanoTrabalho.atividadePesquisa} </td>
	    	<td> ${listaPlanoTrabalho.atividadeExtensao} </td>
	    	<td>
	    		<a href="exibirAlterarPlanoTrabalho?id=${listaPlanoTrabalho.id}">Editar</a>
	    		<a href="removerPlanoTrabalho?id=${listaPlanoTrabalho.id}">Remover</a>
	    	</td>
	    </tr>
	</c:forEach>
	</table>


<c:import url="../menu/menuProfessor.jsp" />