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

    @RequestMapping("/IncluirPessoa")
    public String exibirIncluirPessoa() {

	return "pages/CadastroDePessoa";
    }

    @RequestMapping("salvarPessoa")
    public String salvarPessoa(Pessoa pessoa) {
    

	PessoaDao dao = new PessoaDao();
	dao.salvar(pessoa);
	return "pages/CadastroDePessoa";
    }

    @RequestMapping("gerenciarPessoa")
    public String listarPessoa(Model model) {
    
    	PessoaDao dao = new PessoaDao();
    List<Pessoa> listaPessoa = dao.listar();
    model.addAttribute("listaPessoa", listaPessoa);
 
    
      return "pages/listarPessoa";
    }

    @RequestMapping("removerPessoa")
    public String removerPessoa(Pessoa pessoa, Model model) {

	PessoaDao dao = new PessoaDao();
	dao.remover(pessoa);
	model.addAttribute("mensagem", "Produto Removido com Sucesso");

	return "pages/listarPessoa";
    }
    
    
    
    @RequestMapping("/exibirAlterarPessoa")
    public String exibirAlterarPessoa(Model model, Pessoa pessoa) {

	PessoaDao dao = new PessoaDao();
	pessoa = dao.buscarPorId(pessoa.getId());
	model.addAttribute("pessoa", pessoa);
	 return "pages/editarpessoa";
	
    }


    @RequestMapping("alterarPessoa")
    public String alterarPessoa(Pessoa pessoa, Model model) {

	PessoaDao dao = new PessoaDao();
	dao.alterar(pessoa);
	model.addAttribute("pessoa", pessoa);
	model.addAttribute("mensagem", "Pessoa Alterado com Sucesso");
	
	return "pages/listarPessoa";
    }

}
