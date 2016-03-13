<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<br>
    <div class="container">
      <div class="col-md-12" style="padding-left: 20%">
        <div class="row">
            <h3>DADOS CADASTRAIS</h3>
        </div>
        <br>
        <form action="alterarPessoa" method="post">
          <input type="hidden" name="id" value="${Pessoa.id}">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CAMPUS</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Campus"
                type="text" name="campus" value="${Pessoa.campus}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">DIRETORIA / DEPARTAMENTO / COORDENAÇÃO</label>
                <input class="form-control"
                id="exampleInputEmail1" placeholder="Diretoria / Departamento / Coordenação"
                type="text" name="diretoria" value="${Pessoa.diretoria}">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-9">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">PROFESSOR(A)</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Professor(a)" type="text" name="professor" value="${Pessoa.professor}">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">MATRÍCULA SIAPE Nº</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Matrícula Siape" type="text" name="siape" value="${Pessoa.matricula}">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-9">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">EMAIL</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Email"
                type="email" name="email" value="${Pessoa.email}">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">TELEFONE</label>
                <input class="form-control" id="exampleInputEmail1" placeholder="Telefone"
                type="text" name="telefone" value="${Pessoa.telefone}">
              </div>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">ÁREA DE CONHECIMENTO</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Área de Conhecimento" type="text" name="area" value="${Pessoa.area}">
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CLASSE (ART. 1°)</label>
                <input class="form-control" id="exampleInputEmail1"
                placeholder="Classe (artigo 1º)" type="text" name="classe" value="${Pessoa.classe}">
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
                      <input type="radio" name="regime" value="20h" <c:if test="${Pessoa.regime eq '20h'}">checked="checked"</c:if> >20 h</label>
                    <label class="radio-inline" for="radios-1">
                      <input type="radio" name="regime" value="40h" <c:if test="${Pessoa.regime eq '40h'}">checked="checked"</c:if> >40 h</label>
                    <label class="radio-inline" for="radios-2">
                      <input type="radio" name="regime" value="DE" <c:if test="${Pessoa.regime eq 'DE'}">checked="checked"</c:if>>DE</label>
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
    