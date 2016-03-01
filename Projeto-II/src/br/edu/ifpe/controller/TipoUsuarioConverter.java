package br.edu.ifpe.controller;

import org.springframework.core.convert.converter.Converter;

import br.edu.ifpe.model.classes.TipoUsuario;
import br.edu.ifpe.model.dao.TipoUsuarioDao;


public class TipoUsuarioConverter implements Converter<String, TipoUsuario> {

    public TipoUsuario convert(String id) {

    TipoUsuarioDao dao = new TipoUsuarioDao();
	return dao.buscarPorId(Integer.valueOf(id));
    }
}
