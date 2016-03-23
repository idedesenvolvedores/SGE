package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.model.dao.PlanoTrabalhoDao;

@Controller
public class PlanoTrabalhoController {
	    
		//----------- Incluir Plano de Trabalho ------------//
	    
	    @RequestMapping("/exibirIncluirPlanoTrabalho")
	    public String exibirIncluirPlanoTrabalho() {

		return "formulario/incluirPlanoTrabalho";
	    }

	    @RequestMapping("incluirPlanoTrabalho")
	    public String IncluirPlanoTrabalho(PlanoTrabalho plano) {

	    PlanoTrabalhoDao dao = new PlanoTrabalhoDao();
		dao.salvarPlanoTrabalho(plano);
		return "pages/indexProfessor";
	    }
	    
	  //--------- Listar Plano de Ensino -----------//
	    @RequestMapping("listarPlanoTrabalho")
	    public String listarPlanoTrabalho(Model model) {

		PlanoTrabalhoDao dao = new PlanoTrabalhoDao();
		List<PlanoTrabalho> listaPlanoTrabalho = dao.listarPlanoTrabalho();
		model.addAttribute("listaPlanoTrabalho", listaPlanoTrabalho);
		return "formulario/pesquisarPlanoTrabalho";
	    }    
	    
	    //--------- Remover Plano de Trabalho -----------//
	    @RequestMapping("removerPlanoTrabalho")
	    public String removerPlanoTrabalho(PlanoTrabalho planoTrabalho, Model model) {

		PlanoTrabalhoDao dao = new PlanoTrabalhoDao();
		dao.removerPlanoTrabalho(planoTrabalho);
		model.addAttribute("mensagem", "Plano de trabalho removido com Sucesso");

		return "forward:listarPlanoTrabalho";
	    }
	    
	    //--------- Alterar Plano de Trabalho -----------//

	    
	    @RequestMapping("/exibirAlterarPlanoTrabalho")
	    public String exibirAlterarPlanoTrabalho(Model model, PlanoTrabalho plano) {

		PlanoTrabalhoDao dao = new PlanoTrabalhoDao();
		plano = dao.buscarPorIdPlanoTrabalho(plano.getId());
		model.addAttribute("PlanoTrabalho", plano);

		return "formulario/alterarPlanoTrabalho";
	    }
	    
	    @RequestMapping("alterarPlanoTrabalho")
	    public String alterarPlanoTrabalho(PlanoTrabalho planoTrabalho, Model model) {

		PlanoTrabalhoDao dao = new PlanoTrabalhoDao();
		dao.alterarPlanoTrabalho(planoTrabalho);
		model.addAttribute("planoDeTrabalho", planoTrabalho);
		model.addAttribute("mensagem", "Plano de Trabalho Alterado com Sucesso");
		
		return "formulario/alterarPlanoTrabalho";
	    }
	
}
