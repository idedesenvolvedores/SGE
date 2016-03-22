package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.model.classes.Pessoa;
import br.edu.ifpe.util.ConnectionFactory;

public class PessoaDao {

    private Connection connection;

    public PessoaDao() {

	try {
	    this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

	
  //------------Salvar Pessoa---------------------------//
    
    public void salvarPessoa(Pessoa pessoa) {

	try {
	    String sql = "INSERT INTO PESSOA (TELEFONE, CAMPUS, REG_TRABALHO, AREA, CLASSE, DIRETORIA) VALUES (?,?,?,?,?,?)";
	    
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, pessoa.getTelefone());
	    stmt.setString(2, pessoa.getCampus());
	    stmt.setString(3, pessoa.getRegime());
	    stmt.setString(4, pessoa.getArea());
	    stmt.setString(5, pessoa.getClasse());
	    stmt.setString(6, pessoa.getDiretoria());

	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

    // ----------- Listar Pessoa ------------//
    
    public List<Pessoa> listarPessoa() {

	try {

	    List<Pessoa> listaPessoa= new ArrayList<Pessoa>();
	    PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM USUARIO WHERE ID_TIPO_USUARIO LIKE 2 ORDER BY ID");

	    ResultSet rs = stmt.executeQuery();

	    while (rs.next()) {
		listaPessoa.add(montarObjetoPessoa(rs));
	    }

	    rs.close();
	    stmt.close();
	    connection.close();

	    return listaPessoa;

	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    

    public void removerPessoa(Pessoa pessoa) {

	try {
	    PreparedStatement stmt = connection.prepareStatement("DELETE FROM PESSOA WHERE id = ?");
	    stmt.setLong(1, pessoa.getId());
	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

    
     //------- Alterar Pessoa ----------//
     
     public void alterarPessoa(Pessoa pessoa) {

 	String sql = "UPDATE PESSOA SET TELEFONE = ? , CAMPUS = ?  , REG_TRABALHO = ?  , AREA = ?  , CLASSE = ?  , DIRETORIA = ? WHERE id = ?";

 	try {

 	    PreparedStatement stmt = connection.prepareStatement(sql);
 	    
 	    stmt.setString(1, pessoa.getTelefone());
 	    stmt.setString(2, pessoa.getCampus());
 	    stmt.setString(3, pessoa.getRegime());
 	    stmt.setString(4, pessoa.getArea());
 	    stmt.setString(5, pessoa.getClasse());
 	    stmt.setString(6, pessoa.getDiretoria());
	    stmt.setInt(7, pessoa.getId());
 	    
 	    stmt.execute();
 	    stmt.close();
 	    connection.close();
 	} catch (SQLException e) {
 	    throw new RuntimeException(e);
 	}
     }

     
// ------------- Buscar por id -------------------//
     
     //--------- Buscar por id Pessoa --------------//
     
     public Pessoa buscarPorIdPessoa(int id) {

    		try {
    		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM PESSOA WHERE ID = ?");
    		    stmt.setInt(1, id);
    		    ResultSet rs = stmt.executeQuery();

    		    Pessoa pessoa = null;
    		    if (rs.next()) {
    		    	pessoa = montarObjetoPessoa(rs);
    		    }

    		    rs.close();
    		    stmt.close();
    		    connection.close();
    		    return pessoa;
    		} catch (SQLException e) {
    		    throw new RuntimeException(e);
    		}
     }

 
    private Pessoa montarObjetoPessoa(ResultSet rs) throws SQLException {

    Pessoa pessoa = new Pessoa();
    pessoa.setCampus(rs.getString("campus"));
    pessoa.setDiretoria(rs.getString("diretoria"));
    pessoa.setTelefone(rs.getString("telefone"));
    pessoa.setArea(rs.getString("area"));
    pessoa.setClasse(rs.getString("classe"));
    pessoa.setRegime(rs.getString("reg_trabalho"));
    
	return pessoa;
    }
    

	
}
