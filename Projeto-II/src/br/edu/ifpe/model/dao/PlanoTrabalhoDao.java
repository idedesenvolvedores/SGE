package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.util.ConnectionFactory;

public class PlanoTrabalhoDao {

    private Connection connection;

    public PlanoTrabalhoDao() {

	try {
	    this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
  //-----------------Salvar Plano de Trabalho-----------------
    
    public void salvarPlanoTrabalho(PlanoTrabalho plano) {

	try {
	    String sql = "INSERT INTO PLANO_TRABALHO (ATIVIDADE_APOIO, ATIVIDADE_PESQUISA, ATIVIDADE_EXTENSAO)" + "VALUES (?,?,?)";
	    
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, plano.getAtividadeApoio());
	    stmt.setString(2, plano.getAtividadePesquisa());
	    stmt.setString(3, plano.getAtividadeExtensao());

	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

   
    // ----------- Listar Plano de Trabalho------------//
    
    public List<PlanoTrabalho> listarPlanoTrabalho() {

	try {

	    List<PlanoTrabalho> listaPlanoTrabalho = new ArrayList<PlanoTrabalho>();
	    PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM PLANO_TRABALHO ORDER BY ID");

	    ResultSet rs = stmt.executeQuery();

	    while (rs.next()) {
		listaPlanoTrabalho.add(montarObjetoPlanoTrabalho(rs));
	    }

	    rs.close();
	    stmt.close();
	    connection.close();

	    return listaPlanoTrabalho;

	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }    
    //------ Remover Plano de Trabalho --------//
    
    public void removerPlanoTrabalho(PlanoTrabalho planoTrabalho) {

	try {
	    PreparedStatement stmt = connection.prepareStatement("DELETE FROM PLANO_TRABALHO WHERE id = ?");
	    stmt.setLong(1, planoTrabalho.getId());
	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

     //------- Alterar Plano de Trabalho ----------//
     
     public void alterarPlanoTrabalho(PlanoTrabalho planoTrabalho) {

 	String sql = "UPDATE PLANO_TRABALHO SET ATIVIDADE_APOIO = ? , ATIVIDADE_PESQUISA = ? , ATIVIDADE_EXTENSAO = ? WHERE id = ?";

 	try {

 	    PreparedStatement stmt = connection.prepareStatement(sql);
 	    stmt.setString(1, planoTrabalho.getAtividadeApoio());
 	    stmt.setString(2, planoTrabalho.getAtividadePesquisa());
 	    stmt.setString(3, planoTrabalho.getAtividadeExtensao());
 	    
 	    stmt.execute();
 	    stmt.close();
 	    connection.close();
 	} catch (SQLException e) {
 	    throw new RuntimeException(e);
 	}
     }

     //--------- Buscar por id Plano de Trabalho --------------//
     
     public PlanoTrabalho buscarPorIdPlanoTrabalho(int id) {

    		try {
    		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM PLANO_TRABALHO WHERE id = ?");
    		    stmt.setInt(1, id);
    		    ResultSet rs = stmt.executeQuery();

    		    PlanoTrabalho planoTrabalho = null;
    		    if (rs.next()) {
    		    	planoTrabalho = montarObjetoPlanoTrabalho(rs);
    		    }

    		    rs.close();
    		    stmt.close();
    		    connection.close();
    		    return planoTrabalho;
    		} catch (SQLException e) {
    		    throw new RuntimeException(e);
    		}
    }
          

    private PlanoTrabalho montarObjetoPlanoTrabalho(ResultSet rs) throws SQLException {

    PlanoTrabalho planoTrabalho = new PlanoTrabalho();
    planoTrabalho.setId(rs.getInt("id"));
    planoTrabalho.setAtividadeApoio(rs.getString("ATIVIDADE_APOIO"));
    planoTrabalho.setAtividadePesquisa(rs.getString("ATIVIDADE_PESQUISA"));
    planoTrabalho.setAtividadeExtensao(rs.getString("ATIVIDADE_EXTENSAO"));
    
	return planoTrabalho;
    }
    
	
}
