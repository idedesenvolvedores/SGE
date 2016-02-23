<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="cabeca.jsp" />
<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12"></div>
        </div>
      </div>
    </div>
    
    
    
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-3"></div>
          <div class="col-md-9">
            <div class="jumbotron">
              <hr>
              <h3 contenteditable="true">Lista de entregas</h3>
              <table class="table">
                <thead>
                  <tr>
                    <th>Nome</th>
                    <th>SIAPE</th>
                    <th>Semestre</th>
                    <th>Data de entrega</th>
                  </tr>
                </thead>
                <tbody >
                <c:forEach var="listaregistro" items="${listaProduto}">
                  <tr>
                    <td>${registro.id}</td>
                    <td>${registro.nome }</td>
                    <td>${registro.siape}</td>
                    <td>${registro.semestre}</td>
                    <td>${registro.dataEntrega}</td>
                  </tr>
                 </c:forEach>           
                </tbody>
              </table>
            </div>
            <div class="col-md-4">
              <a class="btn btn-warning">editar</a>
            </div>
            <div class="col-md-2">
              <a class="btn btn-success">Voltar</a>
            </div>
         
          </div>
        </div>
      </div>
    </div>