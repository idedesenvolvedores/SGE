package br.edu.ifpe.controller;

import org.springframework.core.convert.converter.Converter;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.dao.UsuarioDao;

public abstract class UsuarioConverter implements Converter<String, Usuario> {

    public Usuario convert(int id) {
    	
    	UsuarioDao dao = new UsuarioDao();
	return dao.buscarPorId(id);
    }
}
