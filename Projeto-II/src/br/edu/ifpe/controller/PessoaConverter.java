package br.edu.ifpe.controller;

import org.springframework.core.convert.converter.Converter;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.model.dao.FormularioDao;

public class PessoaConverter implements Converter<String, Pessoa> {

    public Pessoa convert(String siape) {

	FormularioDao dao = new FormularioDao();
	return dao.buscarPorIdPessoa(siape);
    }
}
