
package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Registro;
import br.edu.ifpe.model.dao.RegistroDao;


@Controller
public class EntregaController {

		
		@RequestMapping("/RegistroDeEntrga")
		public String incluirRegistro(Registro registro) {

			return "pages/RegistroDeEntrega";

		}		

		@RequestMapping("/salvarRegistro")
		public String valtarcabeca(Registro registro, Model model) {

			RegistroDao dao = new RegistroDao();
			dao.salvar(registro);
			model.addAttribute("mensagem", "Registro adicionado!");
			return "pages/RegistroDeEntrega";

		}
		
		@RequestMapping("listaRegistro")
	    public String listarProduto(Model model) {

		RegistroDao dao = new RegistroDao();
		List<Registro> listaRegistro = dao.listar();
		model.addAttribute("listaRegistro", listaRegistro);
		return "pages/ListarRegistro";
	    }


	    @RequestMapping("/exibirAlterarRegistro")
	    public String exibirAlterarRegistro(Model model, Registro  registro ) {

		RegistroDao dao = new RegistroDao ();
		registro = dao.buscarPorId(registro .getId());
		model.addAttribute("registro ", registro );

		return "pages/alterarRegistro";
	    }
	    
	    @RequestMapping("alterarRegistro")
	    public String alterarProduto(Registro registro , Model model) {

	    RegistroDao dao = new RegistroDao();
		dao.alterar(registro );
		model.addAttribute("registro", registro );
		model.addAttribute("mensagem", "Registro Alterado com Sucesso");
		
		return "pages/alterarProduto";
	    }

		
		
}
