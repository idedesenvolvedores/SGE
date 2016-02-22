package br.edu.ifpe.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Registro;
import br.edu.ifpe.model.dao.RegistroDao;

@Controller
public class ProfessorController {
	
	@RequestMapping("/IncluirProfessor")
	 public String exibirIncluirRegistro() {
		
		return "pages/CadastroDeProfessor";
	    }

	
	@RequestMapping("/salvarProfessor")
	 public String RegistroDeregistro(Registro registro) {
		
		RegistroDao dao = new RegistroDao();
		dao.salvar(registro);
		return "pages/cabeca";
	}
	
}
