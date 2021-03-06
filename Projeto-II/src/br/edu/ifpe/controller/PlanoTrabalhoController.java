package br.edu.ifpe.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.PessoaDao;
import br.edu.ifpe.model.dao.PlanoTrabalhoDao;

@Controller
public class PlanoTrabalhoController {

	//----------- Incluir Plano de Trabalho ------------//

	@RequestMapping("/exibirIncluirPlanoTrabalho")
	public String exibirIncluirPlanoTrabalho(String siape) {

		return "formulario/incluirPlanoTrabalho";
	}

	@RequestMapping("incluirPlanoTrabalho")
	public String IncluirPlanoTrabalho(@Valid PlanoTrabalho plano, BindingResult result, Pessoa pessoa, String siape) {

		if (result.hasErrors()) {
			return "forward:exibirIncluirPlanoTrabalho";
		}
		
		pessoa = new Pessoa();
		siape = pessoa.getSiape();
		PlanoTrabalhoDao dao2 = new PlanoTrabalhoDao();
		
		dao2.salvarPlanoTrabalho(plano, siape);
		return "forward:listarPlanoTrabalho";
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
	public String exibirAlterarPlanoTrabalho(PlanoTrabalho plano, Model model) {

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
