<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> -->
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
          <div class="col-md-12">
            <div class="jumbotron">
              <div class="section">
                <div class="container">
                  <div class="row">
                    <div class="col-md-5"></div>
                    <div class="col-md-6">
                      <h2 class="text-center">Alterar de Entrega</h2>
                      
                      <form action="alterarRegistro" class="form-horizontal" role="form" method="post">
                      
                      <input type="hidden" name="id" value="${registro.id}">
                      
                        <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputNome3" class="control-label">Nome</label>
                          </div>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="nome" placeholder="Nome" name="nome" value="${registro.nome}">
                          </div>
                        </div>
                        <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputSiape" class="control-label">Siape</label>
                          </div>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPassword3" placeholder="Siape" name="siape"  value="${registro.siape}">
                          </div>
                        </div>
                        
                        
                         <div class="form-group">
                          <div class="col-sm-2">
                            <label for="inputSiape" class="control-label">Semestre</label>
                          </div>
                          <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPassword3" placeholder="Semestre" name="semestre" value="${registro.semestre}">
                          </div>
                        </div>
                        
                        
                        
                        <div class="form-group">
                          <div class="col-sm-4">
                            <label for="inputPassword3" class="control-label">Data de entrega</label>
                          </div>
                          <div class="col-sm-8">
                            <input type="text" class="form-control" id="inputPassword3" name="dataEntrega"value="${registro.dateEntrega}"  placeholder="mm/dd/aaaa" >
                          </div>
                        </div>
                        <div class="form-group">
                          <div class="col-sm-offset-2 col-sm-10">
                            <button type="reset" class="btn btn-danger">cancelar</button>&nbsp;&nbsp;&nbsp;
                            <button type="submit" class="btn btn-success">Alterar</button>
                          </div>
                        </div>
                   
                      </form>
                    </div>
                   
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  


<!-- 
</body>
</html>
-->