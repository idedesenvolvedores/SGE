package br.edu.ifpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.AtividadeEnsino;
import br.edu.ifpe.model.classes.AtividadePedagogica;
import br.edu.ifpe.model.classes.Cabecalho;
import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.model.dao.FormularioDao;

@Controller
public class FormularioController {

    @RequestMapping("/exibirIncluirCabecalho")
    public String exibirIncluirProduto() {

	return "formulario/incluirCabecalho";
    }

    @RequestMapping("salvarCabecalho")
    public String incluirProduto(Cabecalho cabecalho) {

	FormularioDao dao = new FormularioDao();
	dao.salvarCabecalho(cabecalho);
	return "formulario/incluirProdutoSucesso";
    }
    
    //--------------------------------------
    
    @RequestMapping("/exibirIncluirAtividadeEnsino")
    public String exibirIncluirAtividadeEnsino() {

	return "formulario/incluirAtividadeEnsino";
    }

    @RequestMapping("incluirAtividadeEnsino")
    public String incluirAtividadeEnsino(AtividadeEnsino atividade) {

    FormularioDao dao = new FormularioDao();
	dao.salvarAtividadeEnsino(atividade);
	return "formulario/incluirProdutoSucesso";
    }

    
    //--------------------------------------
    
    @RequestMapping("/exibirIncluirPlanoTrabalho")
    public String exibirIncluirPlanoTrabalho() {

	return "formulario/incluirPlanoTrabalho";
    }

    @RequestMapping("incluirPlanoTrabalho")
    public String IncluirPlanoTrabalho(PlanoTrabalho plano) {

    FormularioDao dao = new FormularioDao();
	dao.salvarPlanoTrabalho(plano);
	return "formulario/incluirProdutoSucesso";
    }
    //--------------------------------------
    
    @RequestMapping("/exibirIncluirAtividadePedagogica")
    public String exibirIncluirAtividadePedagogica() {

	return "formulario/incluirAtividadePedagogica";
    }

    @RequestMapping("incluirAtividadePedagogica")
    public String IncluirAtividadePedagogica(AtividadePedagogica atividade) {

    FormularioDao dao = new FormularioDao();
	dao.salvarAtividadePedagogica(atividade);
	return "formulario/incluirProdutoSucesso";
    }
  
}