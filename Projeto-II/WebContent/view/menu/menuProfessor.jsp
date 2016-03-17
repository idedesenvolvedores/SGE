<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 

 
     <div class="collapse navbar-collapse navbar-colapse">
      <ul class="nav navbar-nav side-nav" style="background-color: #359135; color: #FFFFFF">
        <li>
         <a href="exibirIncluirPessoa" style="color: #FFFFFF"><i class="fa fa-edit fa-fw fa-lg" ></i> Editar Perfil </a>
        </li>
        <li>
		<a href="exibirAlterarDadosProf?id=${usuarioLogado.id}" style="color: #FFFFFF"><i class="glyphicon glyphicon-lock" ></i> Alterar Senha </a>
        </li>
        <li>
		<a href="exibirIncluirPlanoTrabalho" style="color: #FFFFFF"><i class="fa fa-graduation-cap fa-lg"></i> Plano de Trabalho </a>
        </li>
        <li>
		<a href="exibirIncluirAtividadeEnsino" style="color: #FFFFFF"><i class="fa fa-folder fa-lg"></i> Atividades de Ensino (Aulas)</a>
        </li>
        <li>
			<a href="exibirIncluirAtividadePedagogica" style="color: #FFFFFF"><i class="fa fa-fw fa-lg fa-table"></i> Atividades Administrativo-Pedagógicas </a>
        </li>
        <li>
			<a href="#" style="color: #FFFFFF"><i class="glyphicon glyphicon-print"></i> Imprimir </a>
        </li>
      </ul>
    </div>
     
     

            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav" style="background-color: #359135; color: #FFFFFF">
                    <li>
						<a href="exibirIncluirPessoa" style="color: #FFFFFF"><i class="fa fa-edit fa-fw fa-lg" ></i> Editar Perfil </a>
			        </li>
			        <li>
						<a href="exibirAlterarProfessor?id=${usuarioLogado.id}" style="color: #FFFFFF"><i class="glyphicon glyphicon-lock" ></i> Alterar Senha </a>
			        </li>
			        <li>
			          <a href="exibirIncluirPlanoTrabalho" style="color: #FFFFFF"><i class="fa fa-graduation-cap fa-lg"></i> Plano de Trabalho </a>
			        </li>
			        <li>
						<a href="exibirIncluirAtividadeEnsino" style="color: #FFFFFF"><i class="fa fa-folder fa-lg"></i> Atividades de Ensino (Aulas)</a>
			        </li>
			        <li>
			          <a href="exibirIncluirAtividadePedagogica" style="color: #FFFFFF"><i class="fa fa-fw fa-lg fa-table"></i> Atividades Administrativo-Pedagógicas </a>
			        </li>
			        <li>
						<a href="#" style="color: #FFFFFF"><i class="glyphicon glyphicon-print"></i> Imprimir </a>
			        </li>
                 </ul>
            </div>