package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.PessoaDao;
import br.edu.ifpe.model.dao.UsuarioDao;

@Controller
public class PessoaController {


	//----------- Incluir Pessoa ------------//

	@RequestMapping("/exibirIncluirPessoa")
	public String exibirIncluirPessoa(Model model,  Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
		model.addAttribute("usuarioPreenchido", usuarioPreenchido);
		return "formulario/incluirPessoa";
	}

	@RequestMapping("salvarPessoa")
	public String incluirPessoa(Pessoa pessoa, Usuario usuario) {

		PessoaDao dao = new PessoaDao();
		dao.salvarPessoa(pessoa);
		return "forward:listarPessoa";
	}

	//--------- Listar Pessoa -----------//    

	@RequestMapping("listarPessoa")
	public String listarPessoa(Model model) {

		PessoaDao dao = new PessoaDao();
		
		List<Pessoa> listaPessoa = dao.listarPessoa();
		model.addAttribute("listaPessoa", listaPessoa);
		return "pages/listarProfessor";
	}

	//--------- Alterar Pessoa -----------//

	@RequestMapping("/exibirAlterarPessoa")
	public String exibirAlterarPessoa(Model model, Pessoa pessoa) {

		PessoaDao dao = new PessoaDao();
		pessoa = dao.buscarPorIdPessoa(pessoa.getId());
		model.addAttribute("Pessoa", pessoa);

		return "formulario/alterarPessoa";
	}


	@RequestMapping("imprimirFormulario")
	public String imprimirFormulario() {

		return "formulario/formulario";
	}
	/*
=======
>>>>>>> 0828236511e0547f844aee73262134776b364363
    //--------- Remover Pessoa -----------//

    @RequestMapping("removerPessoa")
    public String removerPessoa(Pessoa pessoa, Model model) {

    PessoaDao dao = new PessoaDao();
	dao.removerPessoa(pessoa);
	model.addAttribute("mensagem", "Usuario removido com Sucesso");

	return "forward:listarAtividadeEnsino";
    } */
}
