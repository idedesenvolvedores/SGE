package br.edu.ifpe.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.Registro;

@Controller
public class LoginController {

	@RequestMapping("/loginSistema")
	public String fazerLogin() {

		return "pages/login";
	}
	
	@RequestMapping("processaLogin")
	public String validador(Model model)
	{
	
		return "algo";
	}
}
