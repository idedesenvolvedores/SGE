package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import br.edu.ifpe.model.classes.TipoUsuario;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.util.ConnectionFactory;

public class UsuarioDao {

	    private Connection connection;

	    public UsuarioDao() {

		try {
		    this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	    }

	    public void salvar(Usuario usuario) {

		try {

		    String sql = "INSERT INTO USUARIO (SIAPE, NOME, EMAIL, SENHA, ID_TIPO_USUARIO) VALUES (?, ?, ?, ?, ?)";
		    PreparedStatement stmt = connection.prepareStatement(sql);
		    stmt.setString(1, usuario.getSiape());
	 	    stmt.setString(2, usuario.getNome());
	 	    stmt.setString(3, usuario.getEmail());
	 		stmt.setString(4, DigestUtils.md5Hex(usuario.getSenha()));
	 	    //stmt.setString(4, usuario.getSenha());
		    stmt.setInt(5, usuario.getTipoUsuario().getId());		    
		    
		    stmt.execute();
		    stmt.close();
		    connection.close();

		} catch (SQLException e) {
		    throw new RuntimeException(e);
			}
	    }
	    public List<Usuario> listarUser() {

		try {
		    List<Usuario> listaUsuario = new ArrayList<Usuario>();
		    PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM USUARIO WHERE ID_TIPO_USUARIO = 1  ORDER BY NOME");

		    ResultSet rs = stmt.executeQuery();

		    while (rs.next()) {
			listaUsuario.add(montarObjeto(rs));
		    }

		    rs.close();
		    stmt.close();
		    connection.close();

		    return listaUsuario;

		} catch (SQLException e) {
		    throw new RuntimeException(e);
			}
	    }

	    public List<Usuario> listarProf() {

			try {
			    List<Usuario> listaUsuario = new ArrayList<Usuario>();
			    PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM USUARIO WHERE ID_TIPO_USUARIO = 2  ORDER BY NOME");

			    ResultSet rs = stmt.executeQuery();

			    while (rs.next()) {
				listaUsuario.add(montarObjeto(rs));
			    }

			    rs.close();
			    stmt.close();
			    connection.close();

			    return listaUsuario;

			} catch (SQLException e) {
			    throw new RuntimeException(e);
				}
		    }
	    
	    public void remover(Usuario usuario) {

		try {
		    PreparedStatement stmt = connection.prepareStatement("DELETE FROM USUARIO WHERE id = ?");
		    stmt.setLong(1, usuario.getId());
		    stmt.execute();
		    stmt.close();
		    connection.close();
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		    }
		}
	    
	    public Usuario buscarPorId(int id) {

		try {
		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM USUARIO WHERE id = ?");
		    stmt.setInt(1, id);
		    ResultSet rs = stmt.executeQuery();

		    Usuario usuario = null;
		    if (rs.next()) {
			usuario = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    connection.close();
		    return usuario;

		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	    }

	    public void alterar(Usuario usuario) {

		String sql = "UPDATE USUARIO SET senha = ?, nome = ?, email = ? WHERE id = ?";

		try {

		    PreparedStatement stmt = connection.prepareStatement(sql);
		    stmt.setString(1, DigestUtils.md5Hex(usuario.getSenha()));
		    //stmt.setString(1, usuario.getSenha());
		    stmt.setString(2, usuario.getNome());
		    stmt.setString(3, usuario.getEmail());
		    stmt.setInt(4, usuario.getId());		    
		    stmt.execute();
		    stmt.close();
		    connection.close();

		} catch (SQLException e) {
		    throw new RuntimeException(e);
			}
	    }

	    public Usuario buscarUsuario(Usuario usuario) {

		try {

		    Usuario usuarioConsultado = null;
		    PreparedStatement stmt = this.connection.prepareStatement("select * from USUARIO where SIAPE = ? and SENHA = ? ");
		    stmt.setString(1, usuario.getSiape());
		    stmt.setString(2,DigestUtils.md5Hex(usuario.getSenha()));
		    //stmt.setString(2, usuario.getSenha());
		    ResultSet rs = stmt.executeQuery();

		    if (rs.next()) {
			usuarioConsultado = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();

		    return usuarioConsultado;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	    }

	    private Usuario montarObjeto(ResultSet rs) throws SQLException {

		Usuario usuario = new Usuario();
		usuario.setId(rs.getInt("id"));
		usuario.setNome(rs.getString("nome"));
		usuario.setSiape(rs.getString("siape"));
		usuario.setEmail(rs.getString("email"));
		usuario.setSenha(rs.getString("senha"));
		TipoUsuarioDao tipoDao = new TipoUsuarioDao();
		TipoUsuario tipousuario = tipoDao.buscarPorId(rs.getInt("id_tipo_usuario"));
		usuario.setTipoUsuario(tipousuario);

		return usuario;
	    }
	
}
