package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.AtividadePedagogica;
import br.edu.ifpe.model.dao.AtividadePedagogicaDao;

@Controller
public class AtividadePedagogicaController {
	    
		//----------- Incluir ------------//
	    
	    @RequestMapping("/exibirIncluirAtividadePedagogica")
	    public String exibirIncluirAtividadePedagogica() {

		return "formulario/incluirAtividadePedagogica";
	    }

	    @RequestMapping("incluirAtividadePedagogica")
	    public String IncluirAtividadePedagogica(AtividadePedagogica atividadePedagogica) {

	    AtividadePedagogicaDao dao = new AtividadePedagogicaDao();
		dao.salvarAtividadePedagogica(atividadePedagogica);
		return "forward:listarAtividadePedagogica";
	    }
	    
	  //--------- Listar -----------//
	    @RequestMapping("listarAtividadePedagogica")
	    public String listarAtividadePedagogica(Model model) {

	    AtividadePedagogicaDao dao = new AtividadePedagogicaDao();
		List<AtividadePedagogica> listaAtividadePedagogica = dao.listarAtividadePedagogica();
		model.addAttribute("listaAtividadePedagogica", listaAtividadePedagogica);
		return "formulario/pesquisarAtividadePedagogica";
	    }    
	    
	    //--------- Remover  -----------//
	    @RequestMapping("removerAtividadePedagogica")
	    public String removerAtividadePedagogica(AtividadePedagogica atividadePedagogica, Model model) {

	    AtividadePedagogicaDao dao = new AtividadePedagogicaDao();
		dao.removerAtividadePedagogica(atividadePedagogica);
		model.addAttribute("mensagem", "Atividade Pedagógica removida com Sucesso");

		return "forward:listarAtividadePedagogica";
	    }
	    
	
}
