package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import br.edu.ifpe.model.classes.Professor;
import br.edu.ifpe.util.ConnectionFactory;

public class ProfessorDao {
	
	private Connection connection;

    public ProfessorDao() {

	try {
	    this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

    public void salvar(Professor professor) {

	try {
	    String sql = "INSERT INTO professor (nome,siape,email,senha) VALUES (?,?,?,?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, professor.getNome());
	    stmt.setString(2, professor.getSiape());
	    stmt.setString(3, professor.getEmail());
	    stmt.setString(4, professor.getSenha());
	    stmt.setString(5, professor.getTelefone());
	    stmt.setString(6, professor.getCampus());
	    stmt.setString(7, professor.getRegTrabalho());
	    stmt.setString(8, professor.getArea());
	    stmt.setString(9, professor.getClasse());
	    stmt.setString(10, professor.getDiretoria());
	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
}
    

}
