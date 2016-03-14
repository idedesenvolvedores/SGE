package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.AtividadeEnsino;
import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.FormularioDao;
import br.edu.ifpe.model.dao.UsuarioDao;

public class PessoaController {

	
//----------- Incluir Pessoa ------------//
	
    @RequestMapping("/exibirIncluirPessoa")
    public String exibirIncluirPessoa() {

	return "formulario/incluirPessoa";
    }

    @RequestMapping("salvarPessoa")
    public String incluirPessoa(Pessoa pessoa, Usuario usuario) {

	FormularioDao dao = new FormularioDao();
	UsuarioDao dao2 = new UsuarioDao();
	dao.salvarPessoa(pessoa);
	dao2.salvar(usuario);
	return "forward:listarPessoa";
    }
    
 //--------- Listar Pessoa -----------//    
    
    @RequestMapping("listarPessoa")
    public String listarPessoa(Model model) {

	FormularioDao dao = new FormularioDao();
	List<Pessoa> listaPessoa = dao.listarPessoa();
	model.addAttribute("listaPessoa", listaPessoa);
	return "pages/listarProfessor";
    }
    
    //--------- Alterar Pessoa -----------//
    /*
    @RequestMapping("/exibirAlterarPessoa")
    public String exibirAlterarPessoa(Model model, Pessoa pessoa) {

	FormularioDao dao = new FormularioDao();
	pessoa = dao.buscarPorIdPessoa(pessoa.());
	model.addAttribute("Pessoa", pessoa);

	return "formulario/alterarPessoa";
    }
    
    //--------- Remover Pessoa -----------//
    
    @RequestMapping("removerPessoa")
    public String removerPessoa(Pessoa pessoa, Model model) {

	FormularioDao dao = new FormularioDao();
	dao.removerPessoa(pessoa);
	model.addAttribute("mensagem", "Usuario removido com Sucesso");

	return "forward:listarAtividadeEnsino";
    } */ 
}
