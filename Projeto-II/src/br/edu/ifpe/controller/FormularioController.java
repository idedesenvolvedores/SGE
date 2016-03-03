package br.edu.ifpe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpe.model.classes.AtividadeEnsino;
import br.edu.ifpe.model.classes.AtividadePedagogica;
import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.FormularioDao;
import br.edu.ifpe.model.dao.UsuarioDao;

@Controller
public class FormularioController {

//----------- Incluir ------------//	

	
    
	//----------- Incluir Atividade de Ensino ------------//
    
    @RequestMapping("/exibirIncluirAtividadeEnsino")
    public String exibirIncluirAtividadeEnsino() {

	return "formulario/incluirAtividadeEnsino";
    }

    @RequestMapping("incluirAtividadeEnsino")
    public String incluirAtividadeEnsino(AtividadeEnsino atividade) {

    FormularioDao dao = new FormularioDao();
	dao.salvarAtividadeEnsino(atividade);
	return "forward:listarAtividadeEnsino";
    }

    
	//----------- Incluir Atividade Plano de Trabalho ------------//
    
    @RequestMapping("/exibirIncluirPlanoTrabalho")
    public String exibirIncluirPlanoTrabalho() {

	return "formulario/incluirPlanoTrabalho";
    }

    @RequestMapping("incluirPlanoTrabalho")
    public String IncluirPlanoTrabalho(PlanoTrabalho plano) {

    FormularioDao dao = new FormularioDao();
	dao.salvarPlanoTrabalho(plano);
	return "forward:listarPlanoTrabalho";
    }
	//----------- Incluir Atividade Pedagógica ------------//
    
    @RequestMapping("/exibirIncluirAtividadePedagogica")
    public String exibirIncluirAtividadePedagogica() {

	return "formulario/incluirAtividadePedagogica";
    }

    @RequestMapping("incluirAtividadePedagogica")
    public String IncluirAtividadePedagogica(AtividadePedagogica atividade) {

    FormularioDao dao = new FormularioDao();
	dao.salvarAtividadePedagogica(atividade);
	return "forward:listarAtividadePedagogica";
    }
  
//--------- Listar -----------//
    
  //--------- Listar Plano de Ensino -----------//
    @RequestMapping("listarPlanoTrabalho")
    public String listarPlanoTrabalho(Model model) {

	FormularioDao dao = new FormularioDao();
	List<PlanoTrabalho> listaPlanoTrabalho = dao.listarPlanoTrabalho();
	model.addAttribute("listaPlanoTrabalho", listaPlanoTrabalho);
	return "formulario/pesquisarPlanoTrabalho";
    }
  
    //--------- Listar Atividade Pedagógica -----------//
    
    @RequestMapping("listarAtividadePedagogica")
    public String listarAtividadePedagogica(Model model) {

	FormularioDao dao = new FormularioDao();
	List<AtividadePedagogica> listaAtividadePedagogica = dao.listarAtividadePedagogica();
	model.addAttribute("listaAtividadePedagogica", listaAtividadePedagogica);
	return "formulario/pesquisarAtividadePedagogica";
    }

    //--------- Listar Atividade de Ensino -----------//    
    
    @RequestMapping("listarAtividadeEnsino")
    public String listarAtividadeEnsino(Model model) {

	FormularioDao dao = new FormularioDao();
	List<AtividadeEnsino> listaAtividadeEnsino = dao.listarAtividadeEnsino();
	model.addAttribute("listaAtividadeEnsino", listaAtividadeEnsino);
	return "formulario/pesquisarAtividadeEnsino";
    }

   
//---------- Remover -----------------//    
    
    //--------- Remover Plano de Trabalho -----------//
    @RequestMapping("removerPlanoTrabalho")
    public String removerPlanoTrabalho(PlanoTrabalho planoTrabalho, Model model) {

	FormularioDao dao = new FormularioDao();
	dao.removerPlanoTrabalho(planoTrabalho);
	model.addAttribute("mensagem", "Plano de trabalho removido com Sucesso");

	return "forward:listarPlanoTrabalho";
    }
    
    //--------- Remover Atividade Pedagógica -----------//
    @RequestMapping("removerAtividadePedagogica")
    public String removerAtividadePedagogica(AtividadePedagogica atividade, Model model) {

	FormularioDao dao = new FormularioDao();
	dao.removerAtividadePedagogica(atividade);
	model.addAttribute("mensagem", "Atividade Pedagógica removida com Sucesso");

	return "forward:listarAtividadePedagogica";
    }

    //--------- Remover Atividade de Ensino -----------//
    @RequestMapping("removerAtividadeEnsino")
    public String removerAtividadeEnsino(AtividadeEnsino atividadeEnsino, Model model) {

	FormularioDao dao = new FormularioDao();
	dao.removerAtividadeEnsino(atividadeEnsino);
	model.addAttribute("mensagem", "Atividade de ensino removida com Sucesso");

	return "forward:listarAtividadeEnsino";
    }    

//---------- Alterar ---------------//
    

    
    //--------- Alterar Atividade Ensino -----------//
    
    @RequestMapping("/exibirAlterarAtividadeEnsino")
    public String exibirAlterarAtividadeEnsino(Model model, AtividadeEnsino atividade) {

	FormularioDao dao = new FormularioDao();
	atividade = dao.buscarPorIdAtividadeEnsino(atividade.getId());
	model.addAttribute("AtividadeEnsino", atividade);

	return "formulario/alterarAtividadeEnsino";
    }
    
    @RequestMapping("alterarAtividadeEnsino")
    public String alterarAtividadeEnsino(AtividadeEnsino atividade, Model model) {

	FormularioDao dao = new FormularioDao();
	dao.alterarAtividadeEnsino(atividade);
	model.addAttribute("atividade", atividade);
	model.addAttribute("mensagem", "Atividade de Ensino Alterado com Sucesso");
	
	return "formulario/alterarAtividadeEnsino";
    }

    
    //--------- Alterar Plano de Trabalho -----------//

    
    @RequestMapping("/exibirAlterarPlanoTrabalho")
    public String exibirAlterarPlanoTrabalho(Model model, PlanoTrabalho plano) {

	FormularioDao dao = new FormularioDao();
	plano = dao.buscarPorIdPlanoTrabalho(plano.getId());
	model.addAttribute("PlanoTrabalho", plano);

	return "formulario/alterarPlanoTrabalho";
    }
    
    @RequestMapping("alterarPlanoTrabalho")
    public String alterarPlanoTrabalho(PlanoTrabalho planoTrabalho, Model model) {

	FormularioDao dao = new FormularioDao();
	dao.alterarPlanoTrabalho(planoTrabalho);
	model.addAttribute("planoDeTrabalho", planoTrabalho);
	model.addAttribute("mensagem", "Plano de Trabalho Alterado com Sucesso");
	
	return "formulario/alterarPlanoTrabalho";
    }
    
}