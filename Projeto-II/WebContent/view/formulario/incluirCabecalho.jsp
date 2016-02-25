<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--
<br>
    <div class="container">
      <div class="col-md-12" style="padding-left: 20%">
        <div class="row">
            <legend>DADOS CADASTRAIS</legend>
        </div>
        <br>
        <form action="salvarCabecalho" method="post">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CAMPUS</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Campus"
                type="text" name="campus">
              </div>
            </div>
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">DIRETORIA / DEPARTAMENTO / COORDENAÇÃO</label>
                <input class="form-control"
                id="exampleInputEmail1" placeholder="Diretoria / Departamento / Coordenação"
                type="text" name="diretoria">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-9">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">PROFESSOR(A)</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Professor(a)" type="text" name="professor">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">MATRÍCULA SIAPE Nº</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Matrícula Siape" type="text" name="siape">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-9">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">EMAIL</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Email"
                type="email" name="email">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">TELEFONE</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Telefone"
                type="text" name="telefone">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">ÁREA DE CONHECIMENTO</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Área de Conhecimento" type="text" name="area">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CLASSE (ART. 1°)</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Classe (artigo 1º)" type="text" name="classe">
              </div>
            </div>
            <div class="col-md-3">
              <fieldset>
                <!-- Form Name -->
                <!-- Multiple Radios (inline) 
                <div class="form-group">
                  <label for="radios">REGIME DE TRABALHO</label>
                  <br>
                  <div>
                    <label class="radio-inline" for="radios-0">
                      <input type="radio" name="regime" value="20h " checked="checked">20 h</label>
                    <label class="radio-inline" for="radios-1">
                      <input type="radio" name="regime" value="40h">40 h</label>
                    <label class="radio-inline" for="radios-2">
                      <input type="radio" name="regime" value="DE">DE</label>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
          <br>
          <div class="form-group" align="center">
            <div class="col-md-12">
              <input type="reset" value="Limpar" class="btn btn-danger">&nbsp; &nbsp;
              <input type="submit" value="Finalizar" class="btn btn-success">
            </div>
          </div>
        </form>
      </div>
    </div>

<c:import url="../menu/menuProfessor.jsp" />
     
     
<!-- topo -->
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
				<div style="text-align: center; color: red;"> ${mensagem} </div>
		<br>
		<div class="row">
            <legend>DADOS CADASTRAIS</legend>
        </div>
       <form action="salvarCabecalho" method="post">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CAMPUS</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Campus"
                type="text" name="campus">
              </div>
            </div>
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">DIRETORIA / DEPARTAMENTO / COORDENAÇÃO</label>
                <input class="form-control"
                id="exampleInputEmail1" placeholder="Diretoria / Departamento / Coordenação"
                type="text" name="diretoria">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-9">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">PROFESSOR(A)</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Professor(a)" type="text" name="professor">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">MATRÍCULA SIAPE Nº</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Matrícula Siape" type="text" name="siape">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-9">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">EMAIL</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Email"
                type="email" name="email">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">TELEFONE</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Telefone"
                type="text" name="telefone">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">ÁREA DE CONHECIMENTO</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Área de Conhecimento" type="text" name="area">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CLASSE (ART. 1°)</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Classe (artigo 1º)" type="text" name="classe">
              </div>
            </div>
            <div class="col-md-3">
              <fieldset>
                <!-- Form Name -->
                <!-- Multiple Radios (inline) -->
                <div class="form-group">
                  <label for="radios">REGIME DE TRABALHO</label>
                  <br>
                  <div>
                    <label class="radio-inline" for="radios-0">
                      <input type="radio" name="regime" value="20h " checked="checked">20 h</label>
                    <label class="radio-inline" for="radios-1">
                      <input type="radio" name="regime" value="40h">40 h</label>
                    <label class="radio-inline" for="radios-2">
                      <input type="radio" name="regime" value="DE">DE</label>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
          <br>
          <div class="form-group" align="center">
            <div class="col-md-12">
              <input type="reset" value="Limpar" class="btn btn-danger">&nbsp; &nbsp;
              <input type="submit" value="Finalizar" class="btn btn-success">
            </div>
          </div>
        </form>
			  </div>
			</div>
		</div>
	</div>       	