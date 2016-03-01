package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import br.edu.ifpe.model.classes.TipoUsuario;
import br.edu.ifpe.util.ConnectionFactory;

public class TipoUsuarioDao {

    private Connection connection;

    public TipoUsuarioDao() {

	try {
	    this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

    public void salvarTipo1(TipoUsuario tipoUsuario) {

	try {

	    String sql = "INSERT INTO TIPO_USUARIO (DESCRICAO) VALUES (Administrador)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, tipoUsuario.getDescricao());
	    
	    stmt.execute();
	    stmt.close();
	    connection.close();

	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

    public void salvarTipo2(TipoUsuario tipoUsuario) {

	try {

	    String sql = "INSERT INTO TIPO_USUARIO (DESCRICAO) VALUES (Professor)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, tipoUsuario.getDescricao());
	    
	    stmt.execute();
	    stmt.close();
	    connection.close();

	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

    public TipoUsuario buscarPorId(int id) {

		try {
		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM TIPO_USUARIO WHERE id = ?");
		    stmt.setInt(1, id);
		    ResultSet rs = stmt.executeQuery();

		    TipoUsuario tipoUsuario = null;
		    if (rs.next()) {
		    	tipoUsuario = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    connection.close();
		    return tipoUsuario;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
}     

    
    private TipoUsuario montarObjeto(ResultSet rs) throws SQLException {

    TipoUsuario tipoUsuario = new TipoUsuario();
    tipoUsuario.setId(rs.getInt("id"));
    tipoUsuario.setDescricao(rs.getString("Descricao"));
    
	return tipoUsuario;
    }
}
