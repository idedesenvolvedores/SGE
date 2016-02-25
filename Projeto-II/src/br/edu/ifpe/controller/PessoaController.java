package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.dao.PessoaDao;


@Controller
public class PessoaController {

    @RequestMapping("/IncluirProfessor")
    public String exibirIncluirProfessor() {

	return "pages/CadastroDePessoa";
    }

    @RequestMapping("salvarProfessor")
    public String salvarProfessor(Pessoa professor) {
    

	PessoaDao dao = new PessoaDao();
	dao.salvar(professor);
	return "pages/CadastroDeProfessor";
    }

    @RequestMapping("gerenciarProfessor")
    public String listarProfessor(Model model) {
    
    	PessoaDao dao = new PessoaDao();
    List<Pessoa> listaProfessor = dao.listar();
    model.addAttribute("listaProfessor", listaProfessor);
 
    
      return "pages/listarProfessor";
    }

    @RequestMapping("removerProfessor")
    public String removerProfessor(Pessoa professor, Model model) {

	PessoaDao dao = new PessoaDao();
	dao.remover(professor);
	model.addAttribute("mensagem", "Produto Removido com Sucesso");

	return "pages/listarProfessor";
    }
    
    
    
    @RequestMapping("/exibirAlterarProfessor")
    public String exibirAlterarProfessor(Model model, Pessoa professor) {

	PessoaDao dao = new PessoaDao();
	professor = dao.buscarPorId(professor.getId());
	model.addAttribute("professor", professor);
	 return "pages/editarprofessor";
	
    }


    @RequestMapping("alterarProfessor")
    public String alterarProfessor(Pessoa professor, Model model) {

	PessoaDao dao = new PessoaDao();
	dao.alterar(professor);
	model.addAttribute("professor", professor);
	model.addAttribute("mensagem", "Professor Alterado com Sucesso");
	
	return "pages/listarProfessor";
    }

}
