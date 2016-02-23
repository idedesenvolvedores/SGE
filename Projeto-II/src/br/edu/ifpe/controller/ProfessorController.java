package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpe.model.classes.Professor;
import br.edu.ifpe.model.dao.ProfessorDao;


@Controller
public class ProfessorController {

    @RequestMapping("/IncluirProfessor")
    public String exibirIncluirProfessor() {

	return "pages/CadastroDeProfessor";
    }

    @RequestMapping("salvarProfessor")
    public String salvarProfessor(Professor professor) {
    

	ProfessorDao dao = new ProfessorDao();
	dao.salvar(professor);
	return "pages/CadastroDeProfessor";
    }

    @RequestMapping("gerenciarProfessor")
    public String listarProfessor(Model model) {
    
    	ProfessorDao dao = new ProfessorDao();
    List<Professor> listaProfessor = dao.listar();
    model.addAttribute("listaProfessor", listaProfessor);
 
    
      return "pages/listarProfessor";
    }

    @RequestMapping("removerProfessor")
    public String removerProfessor(Professor professor, Model model) {

	ProfessorDao dao = new ProfessorDao();
	dao.remover(professor);
	model.addAttribute("mensagem", "Produto Removido com Sucesso");

	return "pages/listarProfessor";
    }
    
    
    
    @RequestMapping("/exibirAlterarProfessor")
    public String exibirAlterarProfessor(Model model, Professor professor) {

	ProfessorDao dao = new ProfessorDao();
	professor = dao.buscarPorId(professor.getId());
	model.addAttribute("professor", professor);
	 return "pages/editarprofessor";
	
    }


    @RequestMapping("alterarProfessor")
    public String alterarProfessor(Professor professor, Model model) {

	ProfessorDao dao = new ProfessorDao();
	dao.alterar(professor);
	model.addAttribute("professor", professor);
	model.addAttribute("mensagem", "Professor Alterado com Sucesso");
	
	return "pages/listarProfessor";
    }

}
