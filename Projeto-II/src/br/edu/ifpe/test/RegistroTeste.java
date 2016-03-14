package br.edu.ifpe.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifpe.model.classes.Registro;
import br.edu.ifpe.model.dao.RegistroDao;

public class RegistroTeste {

	@Test
	public void testeSalvarRegistro() {

		RegistroDao dao1 = new RegistroDao();
		List<Registro> lista = dao1.listar();
		int quantidade = lista.size();

		RegistroDao dao2 = new RegistroDao();
		Registro registro = new Registro();
		registro.setNome("Nome Registro");
		registro.setSemestre("2016.1");
		registro.setSiape("321654");
		dao2.salvar(registro);

		RegistroDao dao3 = new RegistroDao();
		lista = dao3.listar();
		int quantidade2 = lista.size();

		Assert.assertEquals(quantidade + 1, quantidade2);
	}

}
