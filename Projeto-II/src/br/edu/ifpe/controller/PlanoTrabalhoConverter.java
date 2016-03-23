package br.edu.ifpe.controller;

import org.springframework.core.convert.converter.Converter;

import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.model.dao.PlanoTrabalhoDao;

public abstract class PlanoTrabalhoConverter implements Converter<String, PlanoTrabalho> {

    public PlanoTrabalho convert(int id) {
    	
    PlanoTrabalhoDao dao = new PlanoTrabalhoDao();
	return dao.buscarPorIdPlanoTrabalho(Integer.valueOf(id));
    }
}
