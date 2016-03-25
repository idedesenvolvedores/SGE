package br.edu.ifpe.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import br.edu.ifpe.model.classes.Pessoa;
//import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.PessoaDao;
//import br.edu.ifpe.model.dao.FormularioDao;
import br.edu.ifpe.model.dao.UsuarioDao;
import br.edu.ifpe.util.Mensagens;

@Controller
public class LoginController {


	@RequestMapping("efetuarLogin")
	public String efetuarLogin(String siape, String senha, HttpSession session, Model model) {

		Usuario usuarioLogado = new Usuario();
		PessoaDao pessoaDao = new PessoaDao();
		UsuarioDao dao = new UsuarioDao();
		Pessoa pessoa = new Pessoa();
		pessoa = pessoaDao.buscarPorSiapePessoa(siape);
		usuarioLogado.setPessoa(pessoa);
		//validação da existencia de pessoa \m/ 
		if(pessoa != null)
		{
			usuarioLogado.setSenha(senha);
			usuarioLogado = dao.buscarUsuario(usuarioLogado);
		}
		else
		{
			usuarioLogado = null;
		}
		//por favor não remova
		

		if (usuarioLogado != null) {

			if (usuarioLogado.getTipoUsuario().getDescricao().equals(Mensagens.professor)) {

				session.setAttribute("usuarioLogado", usuarioLogado);


				return "forward:exibirIndexProfessor";

			} else {

				session.setAttribute("usuarioLogado", usuarioLogado);
				return "pages/indexAdmin";

			}

		}

		model.addAttribute("msg", Mensagens.mensagemUsuarioNaoLogado);
		model.addAttribute("msgvisualizar", "");
		return "pages/login";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {

		session.invalidate();
		return "forward:iniciarLogin";
	}

	@RequestMapping("/iniciarLogin")
	public String exibirHome(Model model) {

		model.addAttribute("msgvisualizar", "none");
		return "pages/login";
	}
}
/*
 * 

 * */