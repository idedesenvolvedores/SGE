package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.UsuarioDao;

@Controller
public class UsuarioController {

	@RequestMapping("/exibirIncluirUsuario")
	public String exibirIncluirUsuario() {

		return "usuario/incluirUsuario";
	}

	@RequestMapping("incluirUsuario")
	public String incluirUsuario(Usuario usuario, Model model) {

		UsuarioDao dao = new UsuarioDao();
		dao.salvar(usuario);
		model.addAttribute("msg", "O usu�rio " + usuario.getNome() + " foi inserido com Sucesso !");
		return "pages/indexAdmin";
	 }

	  @RequestMapping("/listarUsuario")
	  public String listarUsuario(Model model)
	  {	  
	  UsuarioDao dao = new UsuarioDao(); List<Usuario> listaUsuario =
	  dao.listarUser(); model.addAttribute("listaUsuario", listaUsuario);
		  
		  return "usuario/listarUsuario";
	  }
	  
	  @RequestMapping("/listarProfessor")
	  public String listarProfessor(Model model)
	  {	  
	  UsuarioDao dao = new UsuarioDao(); List<Usuario> listaUsuario =
	  dao.listarProf(); model.addAttribute("listaUsuario", listaUsuario);
		  
		  return "usuario/listarProfessor";
	  }
	  
	  
	  @RequestMapping("removerUsuario")
	  public String removerUsuario(Usuario usuario, Model model)
	  {	  
	  UsuarioDao dao = new UsuarioDao(); 
	  dao.remover(usuario);
	  model.addAttribute("msg", "Usuário Removido com Sucesso !");
	  
	  	return "forward:listarUsuario";
	  }
	  
	  @RequestMapping("removerProfessor")
	  public String removerProfessor(Usuario usuario, Model model)
	  {	  
	  UsuarioDao dao = new UsuarioDao(); 
	  dao.remover(usuario);
	  model.addAttribute("msg", "Usuário Removido com Sucesso !");
	  
	  	return "forward:listarProfessor";
	  }
	  
	@RequestMapping("exibirAlteraDados")
	public String exibirAlteraDados(Model model,  Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
		model.addAttribute("usuarioPreenchido", usuarioPreenchido);
		return "pages/alterarSenha";
	}

	@RequestMapping("alterarDados")
	public String alterarDados(Model model,Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		dao.alterar(usuario);
		model.addAttribute("usuario", usuario);
		return "logout";
	}

	@RequestMapping("exibirAlterarProfessor")
	public String exibirAlterarProfessor(Model model,  Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
		model.addAttribute("usuarioPreenchido", usuarioPreenchido);
		return "pages/alterarDadosProf";
	}

	@RequestMapping("alterarProfessor")
	public String alterarProfessor(Model model,Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		dao.alterar(usuario);
		model.addAttribute("usuario",usuario);
		return "pages/indexAdmin";
	}
	
	@RequestMapping("exibirAlterarUsuario")
	public String exibirAlterarUsuario(Model model,  Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
		model.addAttribute("usuarioPreenchido", usuarioPreenchido);
		return "pages/alterarDadosUsuario";
	}

	@RequestMapping("alterarUsuario")
	public String alterarUsuario (Model model,Usuario usuario) {

		UsuarioDao dao = new UsuarioDao();
		dao.alterar(usuario);
		model.addAttribute("usuario", usuario);
		return "pages/indexAdmin";
	}
	
	@RequestMapping("exibirIndexAdm")
	public String exibirTelaAdmin() {

		return "pages/indexAdmin";
	}

	@RequestMapping("exibirIndexProfessor")
	public String exibirTelaProfessor() {

		return "pages/indexProfessor";
	}

}