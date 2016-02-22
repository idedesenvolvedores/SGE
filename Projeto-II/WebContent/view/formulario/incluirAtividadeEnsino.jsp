<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 	<br>
     <div class="container">
      <div class="col-md-12" style="padding-left: 20%">
        <div class="row">
            <legend>ATIVIDADES DE ENSINO (AULAS)</legend>
        </div>
        <br>
	<form action="incluirAtividadeEnsino" method="post">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">DISCIPLINA / COMPONENTE CURRICULAR</label>
                <input class="form-control"
                id="exampleInputEmail1" placeholder="Disciplina / Componente Curricular"
                type="text" name="disciplina">
              </div>
            </div>
            <div class="col-md-4">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CURSO</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Curso"
                type="text" name="curso">
              </div>
            </div>
            
            <div class="col-md-2">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CARGA HORÁRIA</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="ex: 20" 
                type="text" name="cargaHoraria">
              </div>
            </div>
            
 		</div>        
        
          <div class="form-group" align="center">
            <div class="col-md-12"><br>
              <input type="reset" value="Limpar" class="btn btn-danger">&nbsp; &nbsp;
              <input type="submit" value="Finalizar" class="btn btn-success">
            </div>
          </div>
        </form>
      </div>
    </div>
 
<c:import url="../menu/menu.jsp" />