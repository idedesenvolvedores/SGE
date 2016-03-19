package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.AtividadeEnsino;
import br.edu.ifpe.model.dao.AtividadeEnsinoDao;

@Controller
public class AtividadeEnsinoController {
	    
		//----------- Incluir ------------//
	    
	    @RequestMapping("/exibirIncluirAtividadeEnsino")
	    public String exibirIncluirAtividadeEnsino() {

		return "formulario/incluirAtividadeEnsino";
	    }

	    @RequestMapping("incluirAtividadeEnsino")
	    public String IncluirAtividadeEnsino(AtividadeEnsino atividadeEnsino) {

	    AtividadeEnsinoDao dao = new AtividadeEnsinoDao();
		dao.salvarAtividadeEnsino(atividadeEnsino);
		return "forward:listarAtividadeEnsino";
	    }
	    
	  //--------- Listar  -----------//
	    @RequestMapping("listarAtividadeEnsino")
	    public String listarAtividadeEnsino(Model model) {

	    AtividadeEnsinoDao dao = new AtividadeEnsinoDao();
		List<AtividadeEnsino> listaAtividadeEnsino = dao.listarAtividadeEnsino();
		model.addAttribute("listaAtividadeEnsino", listaAtividadeEnsino);
		return "formulario/pesquisarAtividadeEnsino";
	    }    
	    
	    //--------- Remover  -----------//
	    @RequestMapping("removerAtividadeEnsino")
	    public String removerAtividadeEnsino(AtividadeEnsino atividadeEnsino, Model model) {

	    AtividadeEnsinoDao dao = new AtividadeEnsinoDao();
		dao.removerAtividadeEnsino(atividadeEnsino);
		model.addAttribute("mensagem", "Atividade removida com Sucesso");

		return "forward:listarAtividadeEnsino";
	    }
	    
	    //--------- Alterar  -----------//

	    
	    @RequestMapping("/exibirAlterarAtividadeEnsino")
	    public String exibirAlterarAtividadeEnsino(Model model, AtividadeEnsino atividadeEnsino) {

	    AtividadeEnsinoDao dao = new AtividadeEnsinoDao();
	    atividadeEnsino = dao.buscarPorIdAtividadeEnsino(atividadeEnsino.getId());
		model.addAttribute("atividadeEnsino", atividadeEnsino);

		return "formulario/alterarAtividadeEnsino";
	    }
	    
	    @RequestMapping("alterarAtividadeEnsino")
	    public String alterarAtividadeEnsino(AtividadeEnsino atividadeEnsino, Model model) {

	    AtividadeEnsinoDao dao = new AtividadeEnsinoDao();
		dao.alterarAtividadeEnsino(atividadeEnsino);
		model.addAttribute("atividadeEnsino", atividadeEnsino);
		model.addAttribute("mensagem", "Atividade Alterada com Sucesso");
		
		return "formulario/alterarAtividadeEnsino";
	    }
	
}
