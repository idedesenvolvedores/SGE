package br.edu.ifpe.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.FormularioDao;
import br.edu.ifpe.model.dao.UsuarioDao;
import br.edu.ifpe.util.Mensagens;

@Controller
public class LoginController {

	@RequestMapping("efetuarLogin")
	public String efetuarLogin(@RequestParam String siape, @RequestParam String senha, HttpSession session, Model model) {
		
		Usuario usuarioLogado = new Usuario();
		UsuarioDao dao = new UsuarioDao();
		usuarioLogado.setSenha(senha);
		usuarioLogado.setSiape(siape);
		usuarioLogado = dao.buscarUsuario(usuarioLogado);

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
		return "pages/login";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "pages/login";
	}

	@RequestMapping("/exibirHome")
	public String exibirHome(Usuario usuario, HttpSession session, Model model) {

		return "principal/home";
	}

}