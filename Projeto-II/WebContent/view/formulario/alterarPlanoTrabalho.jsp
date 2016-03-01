<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


	<br>
    <div class="container">
      <div class="col-md-12" style="padding-left: 20%">
        <div class="row">
			<legend>ATIVIDADES DE APOIO AO ENSINO</legend>
        </div>

        <form action="alterarPlanoTrabalho" method="post">
			<input type="hidden" name="id" value="${PlanoTrabalho.id}">
          <div class="row">
            <div class="col-md-12">
              <div class="form-group">
                  <div class="col-md-12">
                    <textarea class="form-control" id="textarea" name="atividadeApoio" 
                    placeholder="Digite o texto..." value="${PlanoTrabalho.AtividadeEnsino}"></textarea>
                  </div>
              </div>
            </div>
          </div>
          <br><br>
          
        <div class="row">
			<legend>ATIVIDADES DE PESQUISA, PÓS-GRADUAÇÃO E INOVAÇÃO</legend>
        </div>
          
          <div class="row">
            <div class="col-md-12">
              <div class="form-group">
                  <div class="col-md-12">
                    <textarea class="form-control" id="textarea" name="atividadePesquisa" 
                    placeholder="Digite o texto..." value="${PlanoTrabalho.AtividadePesquisa}"></textarea>
                  </div>
              </div>
            </div>
          </div>

          <br><br>
          
        <div class="row">
			<legend>ATIVIDADES DE EXTENSÃO</legend>
        </div>
          
          <div class="row">
            <div class="col-md-12">
              <div class="form-group">
                  <div class="col-md-12">
                    <textarea class="form-control" id="textarea" name="atividadeExtensao" 
                    placeholder="Digite o texto..." value="${PlanoTrabalho.AtividadeExtensao}"></textarea>
                  </div>
              </div>
            </div>
          </div>

          <div class="form-group" align="center">
            <div class="col-md-12"><br><br>
              <input type="reset" value="Limpar" class="btn btn-danger">&nbsp; &nbsp;
              <input type="submit" value="Finalizar" class="btn btn-success">
            </div>
          </div>
        </form>
      </div>
    </div>

    <c:import url="../menu/menuProfessor.jsp" />

