package br.edu.ifpe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.TipoUsuario;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.FormularioDao;
import br.edu.ifpe.model.dao.TipoUsuarioDao;
import br.edu.ifpe.model.dao.UsuarioDao;

public class UsuarioController {
	
    @RequestMapping("/exibirIncluirUsuario")
    public String exibirIncluirUsuario() {

	return "usuario/incluirUsuario";
    }

    @RequestMapping("incluirUsuario")
    public String incluirUsuario(Usuario usuario, Model model, Pessoa nome) {

	UsuarioDao dao = new UsuarioDao();
	FormularioDao dao2 = new FormularioDao();
	dao.salvar(usuario);
	dao2.salvarPessoa(nome);
	model.addAttribute("msg", "O usu�rio " + nome.getNome() + " foi inserido com Sucesso !");

	return "forward:listarUsuario";
    }

    /*
    
    @RequestMapping("/listarUsuario")
    public String listarUsuario(Model model) {

	UsuarioDao dao = new UsuarioDao();
	List<Usuario> listaUsuario = dao.listar();
	model.addAttribute("listaUsuario", listaUsuario);

	return "usuario/pesquisarUsuario";
    }

    @RequestMapping("removerUsuario")
    public String removerUsuario(Usuario usuario, Model model) {

	UsuarioDao dao = new UsuarioDao();
	dao.remover(usuario);
	model.addAttribute("msg", "Usuário Removido com Sucesso !");

	return "forward:listarUsuario";
    }
*/
    @RequestMapping("exibirAlterarUsuario")
    public String exibirAlterarUsuario(Usuario usuario, Model model) {

	UsuarioDao dao = new UsuarioDao();
	Usuario usuarioPreenchido = dao.buscarPorId(usuario.getId());
	model.addAttribute("usuario", usuarioPreenchido);

	return "formulario/alterarSenha";
    }

    @RequestMapping("alterarUsuario")
    public String alterarUsuario(Usuario usuario) {

	UsuarioDao dao = new UsuarioDao();
	dao.alterar(usuario);

	return "formulario/alterarSenha";
    }

    @RequestMapping("efetuarLogin")
    public String efetuarLogin(Usuario usuario, HttpSession session, Model model) {

	UsuarioDao dao = new UsuarioDao();
	Usuario usuarioLogado = dao.buscarUsuario(usuario);
	

	TipoUsuarioDao dao2 = new TipoUsuarioDao(); 
	TipoUsuario tipo = dao2.buscarPorId(usuarioLogado.getIdTipoUsuario().getId());
	String resul = tipo.getDescricao();
	
	if (usuarioLogado != null) {
	    
		if (resul.equals("Professor")) {
			
			session.setAttribute("usuarioLogado", usuarioLogado);
		    return "forward:exibirIndexProfessor";
			
		}
		
		if (resul.equals("Administrador")) {
			
			session.setAttribute("usuarioLogado", usuarioLogado);
		    return "forward:exibirIndexAdm";
			
		}
		
	}

	model.addAttribute("msg", "N�o foi encontrado um usu�rio com o login e senha informados.");
	return "index";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {

	session.invalidate();
	return "index";
    }

    @RequestMapping("/exibirHome")
    public String exibirHome(Usuario usuario, HttpSession session, Model model) {

	return "principal/home";
    }
	
}