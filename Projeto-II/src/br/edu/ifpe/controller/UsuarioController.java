package br.edu.ifpe.controller;

import java.util.List; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.TipoUsuario;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.PessoaDao;
import br.edu.ifpe.model.dao.UsuarioDao;
import br.edu.ifpe.util.Mensagens;

@Controller
public class UsuarioController {

	//exibe tela de cadastro
	@RequestMapping("/exibirIncluirUsuario")
	public String exibirIncluirUsuario() {

		return "usuario/incluirUsuario";
	}

	//cadastra usuario
	@RequestMapping("incluirUsuario")
	public String incluirUsuario( Pessoa pessoa,int TipoUsuario, Model model) {

		PessoaDao pessoaDao = new PessoaDao();
		UsuarioDao dao = new UsuarioDao();
		TipoUsuario tipoUsuario = new TipoUsuario();
		pessoaDao.salvarPessoa(pessoa);
		Usuario usuario = new Usuario();
		usuario.setPessoa(pessoa);
		usuario.setSenha("123");
		tipoUsuario.setId(TipoUsuario);
		usuario.setTipoUsuario(tipoUsuario);
		dao.salvar(usuario);
		model.addAttribute("msg", "O usuário " + pessoa.getNome() + " foi inserido com Sucesso !");
		return "pages/indexAdmin";
	}

	//lista usuarios cadastrados
	@RequestMapping("/listarUsuario")
	public String listarUsuario(Model model)
	{	  
		UsuarioDao dao = new UsuarioDao(); 
		List<Usuario> listaUsuario =	dao.listarUser();
		model.addAttribute("listaUsuario", listaUsuario);

		return "usuario/listarUsuario";
	}

	//lista professores cadastrados
	@RequestMapping("/listarProfessor")
	public String listarProfessor(Model model)
	{	  
		UsuarioDao dao = new UsuarioDao(); 
		List<Usuario> listaUsuario = dao.listarProf(); 
		model.addAttribute("listaUsuario", listaUsuario);

		return "usuario/listarProfessor";
	}

	//remove usuarios e lista cadastrados
	@RequestMapping("removerUsuario")
	public String removerUsuario(@RequestParam("siape") String siape, Model model)
	{	  
		UsuarioDao dao = new UsuarioDao();
		Usuario usuario = new Usuario();
		usuario = dao.buscarPoSiape(siape);
		dao = new UsuarioDao();
		dao.remover(usuario);


		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscarPorIdPessoa(siape);
		pessoaDao = new PessoaDao();
		pessoaDao.removerPessoa(pessoa);
		model.addAttribute("msg", "Usuário Removido com Sucesso !");

		return "forward:listarUsuario";
	}

	//remove professor e lista cadastrados
	@RequestMapping("removerProfessor")
	public String removerProfessor(@RequestParam("siape") String siape, Model model)
	{	
		UsuarioDao dao = new UsuarioDao();
		Usuario usuario = new Usuario();
		usuario = dao.buscarPoSiape(siape);
		dao = new UsuarioDao();
		dao.remover(usuario);


		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscarPorIdPessoa(siape);
		pessoaDao = new PessoaDao();
		pessoaDao.removerPessoa(pessoa);

		model.addAttribute("msg", "Usuário Removido com Sucesso !");

		return "forward:listarProfessor";
	}

	//exibe tela para alteração de senha e dados
	@RequestMapping("exibirAlteraSenha")
	public String exibirAlteraDados(Model model,  Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
		model.addAttribute("usuarioPreenchido", usuarioPreenchido);

		if (usuarioPreenchido.getTipoUsuario().getDescricao().equals(Mensagens.professor)) {

			model.addAttribute("usuarioPreenchido", usuarioPreenchido);
			return "forward: alterarSenhaProfessor";

		} else {

			model.addAttribute("usuarioPreenchido", usuarioPreenchido);
			return "forward: alterarSenhaAdministrador";

		}
	}

	//altera senha e ou dados
	@RequestMapping("alterarDados")
	public String alterarDados( Usuario usuario, Model model) {

		UsuarioDao dao = new UsuarioDao();
		dao.alterar(usuario);
		model.addAttribute("usuario", usuario);

		return "index";
	}

	//exibe tela para alteração de dados do professor
	@RequestMapping("alterarSenhaProfessor")
	public String exibirAlteraDadosProf( Usuario usuario, Model model) {


		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
		model.addAttribute("usuarioPreenchido", usuarioPreenchido);
		return "pages/alterarSenhaProfessor";
	}

	//exibe tela para alteração de dados do professor
	@RequestMapping("alterarSenhaAdministrador")
	public String alterarSenhaAdministrador(Usuario usuario,Model model) {


		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
		model.addAttribute("usuarioPreenchido", usuarioPreenchido);
		return "pages/alterarSenhaAdministrador";
	}

	//exibe pagina de alteração de dados do professor usado pelo administrador
	@RequestMapping("exibirAlterarProfessor")
	public String exibirAlterarProfessor( Usuario usuario, Model model, @RequestParam("siape") String siape) {

		PessoaDao dao = new PessoaDao();
		Pessoa pessoa = new Pessoa();
		pessoa = dao.buscarPorIdPessoa(siape);
		model.addAttribute("usuarioPreenchido", pessoa);
		return "pages/alterarDadosProf";
	}

	//altera dados do professor
	@RequestMapping("alterarProfessor")
	public String alterarProfessor(Pessoa pessoa,  Model model) {

		PessoaDao dao = new PessoaDao();
		dao.alterarPessoaAdmin(pessoa);

		return "pages/indexAdmin";
	}

	//exibe pagina de alteração de dados do usuario
	@RequestMapping("exibirAlterarUsuario")
	public String exibirAlterarUsuario(@RequestParam("siape") String siape, Model model) {

		PessoaDao dao = new PessoaDao();
		Pessoa pessoa = new Pessoa();
		pessoa = dao.buscarPorIdPessoa(siape);
		model.addAttribute("usuarioPreenchido", pessoa);
		return "pages/alterarDadosUsuario";
	}

	//altera usuario e retorna para página principal do administrador 
	@RequestMapping("alterarUsuario")
	public String alterarUsuario (Pessoa pessoa, Model model) {


		PessoaDao dao = new PessoaDao();
		dao.alterarPessoaAdmin(pessoa);
		return "pages/indexAdmin";
	}

	//exibe página principal do admiistrador
	@RequestMapping("exibirIndexAdm")
	public String exibirTelaAdmin() {

		return "pages/indexAdmin";
	}

	//exibe página principal do professor
	@RequestMapping("exibirIndexProfessor")
	public String exibirTelaProfessor() {

		return "pages/indexProfessor";
	}

}