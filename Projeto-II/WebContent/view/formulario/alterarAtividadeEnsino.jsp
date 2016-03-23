<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	
 	<br>
     <div class="container">
      <div class="col-md-12" style="padding-left: 20%">
        <div class="row">
            <P>ATIVIDADES DE ENSINO (AULAS)</P>
        </div>
        <br>
        
        <div style="text-align: center; color: red;"> ${mensagem} </div>
        
	<form action="alterarAtividadeEnsino" method="post">
	<input type="hidden" name="id" value="${AtividadeEnsino.id}">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">DISCIPLINA / COMPONENTE CURRICULAR</label>
                <input class="form-control"
                id="exampleInputEmail1" type="text" name="disciplina" value="${AtividadeEnsino.disciplina}">
              </div>
            </div>
            <div class="col-md-4">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CURSO</label>
                <input class="form-control" id="exampleInputEmail1" type="text" name="curso" value="${AtividadeEnsino.curso}">
              </div>
            </div>
            
            <div class="col-md-2">
              <div class="form-group">
                <label class="control-label" for="exampleInputEmail1">CARGA HOR�RIA</label>
                <input class="form-control" id="exampleInputEmail1" type="text" name="cargaHoraria" value="${AtividadeEnsino.cargaHoraria}">
              </div>
            </div>
            <input type="hidden" value="${AtividadeEnsino.id_plano_trabalho}">
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
</div>
</div>