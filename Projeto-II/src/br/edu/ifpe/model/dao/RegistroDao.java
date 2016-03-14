package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ifpe.model.classes.Registro;
import br.edu.ifpe.util.ConnectionFactory;

public class RegistroDao {

	private Connection connection;

	public RegistroDao() {

		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void salvar(Registro registro) {

		try {
			String sql = "INSERT INTO ENTREGA  (NOME, SIAPE, SEMESTRE, DATAE) VALUES (?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, registro.getNome());
			stmt.setString(2, registro.getSiape());
			stmt.setString(3, registro.getSemestre());
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTime().getTime()));

			stmt.execute();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Registro> listar() {

		try {

			List<Registro> listaRegistro = new ArrayList<Registro>();
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM ENTREGA  ORDER BY ID");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				listaRegistro.add(montarObjeto(rs));
			}

			rs.close();
			stmt.close();
			connection.close();

			return listaRegistro;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Registro montarObjeto(ResultSet rs) throws SQLException {

		Registro registro = new Registro();
		registro.setId(rs.getInt("id"));
		registro.setNome(rs.getString("nome"));
		registro.setSiape(rs.getString("siape"));
		registro.setSemestre(rs.getString("semestre"));
		registro.setDataEntrega(rs.getDate("datae"));

		return registro;
	}

	public Registro buscarPorId(int id) {

		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM ENTREGA  WHERE id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			Registro registro = null;
			if (rs.next()) {
				registro = montarObjeto(rs);
			}

			rs.close();
			stmt.close();
			connection.close();
			return registro;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remover(Registro registro) {

		try {
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM ENTREGA  WHERE id = ?");
			stmt.setLong(1, registro.getId());
			stmt.execute();
			stmt.close();

			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void alterar(Registro registro) {

		String sql = "UPDATE ENTREGA SET nome = ? , siape = ? , semestre = ? , datae  = ?  WHERE id = ?";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, registro.getNome());
			stmt.setString(2, registro.getSiape());
			stmt.setString(3, registro.getSemestre());
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		

				stmt.setInt(5, registro.getId());
				stmt.execute();
				stmt.close();
				connection.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}