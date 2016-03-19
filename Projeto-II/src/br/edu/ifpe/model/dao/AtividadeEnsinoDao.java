package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.model.classes.AtividadeEnsino;
import br.edu.ifpe.util.ConnectionFactory;

public class AtividadeEnsinoDao {

    private Connection connection;

    public AtividadeEnsinoDao() {

	try {
	    this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
  //-----------------Salvar-----------------
    
    public void salvarAtividadeEnsino(AtividadeEnsino atividadeEnsino) {

	try {
	    String sql = "INSERT INTO ATIVIDADE_ENSINO (DISCIPLINA, CURSO, CARGA_HORARIA)" + "VALUES (?,?,?)";
	    
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, atividadeEnsino.getDisciplina());
	    stmt.setString(2, atividadeEnsino.getCurso());
	    stmt.setInt(3, atividadeEnsino.getCargaHoraria());

	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

   
    // ----------- Listar------------//
    
    public List<AtividadeEnsino> listarAtividadeEnsino() {

	try {

	    List<AtividadeEnsino> listaAtividadeEnsino = new ArrayList<AtividadeEnsino>();
	    PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM ATIVIDADE_ENSINO ORDER BY ID");

	    ResultSet rs = stmt.executeQuery();

	    while (rs.next()) {
		listaAtividadeEnsino.add(montarObjetoAtividadeEnsino(rs));
	    }

	    rs.close();
	    stmt.close();
	    connection.close();

	    return listaAtividadeEnsino;

	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }    
    //------ Remover--------//
    
    public void removerAtividadeEnsino(AtividadeEnsino atividadeEnsino) {

	try {
	    PreparedStatement stmt = connection.prepareStatement("DELETE FROM ATIVIDADE_ENSINO WHERE id = ?");
	    stmt.setLong(1, atividadeEnsino.getId());
	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

     //------- Alterar----------//
     
     public void alterarAtividadeEnsino(AtividadeEnsino atividadeEnsino) {

 	String sql = "UPDATE ATIVIDADE_ENSINO SET DISCIPLINA = ? , CURSO = ? , CARGA_HORARIO = ? WHERE id = ?";

 	try {

 	    PreparedStatement stmt = connection.prepareStatement(sql);
 	    stmt.setString(1, atividadeEnsino.getDisciplina());
 	    stmt.setString(2, atividadeEnsino.getCurso());
 	    stmt.setInt(3, atividadeEnsino.getCargaHoraria());
 	    
 	    stmt.execute();
 	    stmt.close();
 	    connection.close();
 	} catch (SQLException e) {
 	    throw new RuntimeException(e);
 	}
     }

     //--------- Buscar por id--------------//
     
     public AtividadeEnsino buscarPorIdAtividadeEnsino(int id) {

    		try {
    		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM ATIVIDADE_ENSINO WHERE id = ?");
    		    stmt.setInt(1, id);
    		    ResultSet rs = stmt.executeQuery();

    		    AtividadeEnsino atividadeEnsino = null;
    		    if (rs.next()) {
    		    	atividadeEnsino = montarObjetoAtividadeEnsino(rs);
    		    }

    		    rs.close();
    		    stmt.close();
    		    connection.close();
    		    return atividadeEnsino;
    		} catch (SQLException e) {
    		    throw new RuntimeException(e);
    		}
    }
          

    private AtividadeEnsino montarObjetoAtividadeEnsino(ResultSet rs) throws SQLException {

    AtividadeEnsino atividadeEnsino = new AtividadeEnsino();
    atividadeEnsino.setId(rs.getInt("id"));
    atividadeEnsino.setDisciplina(rs.getString("DISCIPLINA"));
    atividadeEnsino.setCurso(rs.getString("CURSO"));
    atividadeEnsino.setCargaHoraria(rs.getInt("CARGA_HORARIA"));
    
	return atividadeEnsino;
    }

	
}
