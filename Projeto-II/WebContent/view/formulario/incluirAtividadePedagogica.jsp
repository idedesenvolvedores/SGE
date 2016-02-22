 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>





    <div class="container">
      <div class="col-md-12" style="padding-left: 20%">
        <div class="row"><br>
          <legend>ATIVIDADES ADMINISTRATIVO-PEDAGÓGICAS</legend>
        </div>
        <br>
        <form action="incluirAtividadePedagogica" method="post">
          <div class="row">
            <div class="col-md-8">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">ATIVIDADE</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Atividade"
                type="text" name="atividade">
              </div>
            </div>
            <div class="col-md-4">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">PORTARIA</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Portaria"
                type="text" name="portaria">
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