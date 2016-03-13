
package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Registro;
import br.edu.ifpe.model.dao.RegistroDao;


@Controller
public class EntregaController {

		
		@RequestMapping("RegistroDeEntrega")
		public String incluirRegistro(Registro registro) {

			return "pages/RegistroDeEntrega";

		}		

		@RequestMapping("/salvarRegistro")
		public String valtarcabeca(Registro registro, Model model) {

			RegistroDao dao = new RegistroDao();
			dao.salvar(registro);
			model.addAttribute("mensagem", "Registro de  "+registro.getNome()+" foi  adicionado!");
			return "forward: listaRegistro";

		}
		
		@RequestMapping("listaRegistro")
	    public String listarProduto(Model model) {

		RegistroDao dao = new RegistroDao();
		List<Registro> listaRegistro = dao.listar();
		model.addAttribute("listaRegistro", listaRegistro);
		return "pages/ListarRegistro";
	    }


	    @RequestMapping("/exibirAlterarRegistro")
	    public String exibirAlterarRegistro(Model model, Registro registro) {

		RegistroDao dao = new RegistroDao();
		Registro registroCompleto = dao.buscarPorId(registro.getId());
		model.addAttribute("registro", registroCompleto);
		
		return "pages/alterarRegistro";
	    }
	    
	    @RequestMapping("alterarRegistro")
	    public String alterarRegistro(Registro registro , Model model) {

	    RegistroDao dao = new RegistroDao();
		dao.alterar(registro);
		model.addAttribute("registro", registro );
		model.addAttribute("mensagem", " O Registro de "+registro.getNome()+" foi Alterado com Sucesso");
		
		return "forward:listaRegistro";
	    }
	    @RequestMapping("removerRegistro")
	    public String removerProduto(Registro registro, Model model) {

	    RegistroDao dao = new RegistroDao ();
		dao.remover(registro);
		model.addAttribute("mensagem", "Registro  Removido com Sucesso");

		return "forward:listaRegistro";
	    }
	}

		

