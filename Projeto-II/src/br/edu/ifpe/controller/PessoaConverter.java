//package br.edu.ifpe.controller;
//
//import org.springframework.core.convert.converter.Converter;
//
//import br.edu.ifpe.model.classes.Pessoa;
//import br.edu.ifpe.model.dao.PessoaDao;
//
//
//public class PessoaConverter implements Converter<String, Pessoa> {
//
//	public Pessoa convert(String id) {
//
//		PessoaDao dao = new PessoaDao();
//		return dao.buscarPorIdPessoa(Integer.valueOf(id));
//	}
//}
