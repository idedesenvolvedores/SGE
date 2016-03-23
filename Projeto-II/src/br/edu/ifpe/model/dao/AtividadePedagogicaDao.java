package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.model.classes.AtividadePedagogica;
import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.util.ConnectionFactory;

public class AtividadePedagogicaDao {

    private Connection connection;

    public AtividadePedagogicaDao() {

	try {
	    this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
  //-----------------Salvar-----------------
    
    public void salvarAtividadePedagogica(AtividadePedagogica atividadePedagogica) {

	try {
	    
		String sql = "INSERT INTO ATIVIDADE_PEDAGOGICA (ATIVIDADE, PORTARIA, ID_PLANO_TRABALHO)" + "VALUES (?,?,?)";
		
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, atividadePedagogica.getAtividade());
	    stmt.setString(2, atividadePedagogica.getPortaria());
	    stmt.setInt(3, atividadePedagogica.getId_tipo_planoTrabalho().getId());
	    
	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

   
    // ----------- Listar------------//
    
    public List<AtividadePedagogica> listarAtividadePedagogica() {

	try {

	    List<AtividadePedagogica> listaAtividadePedagogica = new ArrayList<AtividadePedagogica>();
	    PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM ATIVIDADE_PEDAGOGICA ORDER BY ID");

	    ResultSet rs = stmt.executeQuery();

	    while (rs.next()) {
		listaAtividadePedagogica.add(montarObjetoAtividadePedagogica(rs));
	    }

	    rs.close();
	    stmt.close();
	    connection.close();

	    return listaAtividadePedagogica;

	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }    
    //------ Remover--------//
    
    public void removerAtividadePedagogica(AtividadePedagogica atividadePedagogica) {

	try {
	    PreparedStatement stmt = connection.prepareStatement("DELETE FROM ATIVIDADE_PEDAGOGICA WHERE id = ?");
	    stmt.setLong(1, atividadePedagogica.getId());
	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

     //------- Alterar----------//
     
     public void alterarAtividadePedagogica(AtividadePedagogica atividadePedagogica) {

 	String sql = "UPDATE ATIVIDADE_PEDAGOGICA SET ATIVIDADE = ? , PORTARIA = ? , WHERE id = ?";

 	try {

 	    PreparedStatement stmt = connection.prepareStatement(sql);
 	    stmt.setString(1, atividadePedagogica.getAtividade());
 	    stmt.setString(2, atividadePedagogica.getPortaria());
 	    stmt.setInt(3, atividadePedagogica.getId());
 	    
 	    stmt.execute();
 	    stmt.close();
 	    connection.close();
 	} catch (SQLException e) {
 	    throw new RuntimeException(e);
 	}
     }

     //--------- Buscar por id--------------//
     
     public AtividadePedagogica buscarPorIdAtividadePedagogica(int id) {

    		try {
    		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM ATIVIDADE_PEDAGOGICA WHERE id = ?");
    		    stmt.setInt(1, id);
    		    ResultSet rs = stmt.executeQuery();

    		    AtividadePedagogica atividadePedagogica = null;
    		    if (rs.next()) {
    		    	atividadePedagogica = montarObjetoAtividadePedagogica(rs);
    		    }

    		    rs.close();
    		    stmt.close();
    		    connection.close();
    		    return atividadePedagogica;
    		} catch (SQLException e) {
    		    throw new RuntimeException(e);
    		}
    }
          

    private AtividadePedagogica montarObjetoAtividadePedagogica(ResultSet rs) throws SQLException {

    AtividadePedagogica atividadePedagogica = new AtividadePedagogica();
    atividadePedagogica.setId(rs.getInt("id"));
    atividadePedagogica.setAtividade(rs.getString("ATIVIDADE"));
    atividadePedagogica.setPortaria(rs.getString("PORTARIA"));
    PlanoTrabalhoDao planoDao = new PlanoTrabalhoDao();
    PlanoTrabalho plano = planoDao.buscarPorIdPlanoTrabalho(rs.getInt("ID_PLANO_TRABALHO"));
    atividadePedagogica.setId_tipo_planoTrabalho(plano);


    
	return atividadePedagogica;
    }

	
}
