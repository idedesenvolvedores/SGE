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

    public void salvar(Pessoa professor) {

	try {
	    String sql = "INSERT INTO PROFESSOR (NOME,SIAPE,EMAIL,SENHA,TELEFONE,CAMPUS,REG_TRABALHO,AREA,CLASSE,DIRETORIA) VALUES (?,?,?,?,?,?,?,?,?,?)";
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

	public List<Pessoa> listar() {
		// TODO Auto-generated method stub
	
	
		try {
			List<Pessoa> listaProfessor = new ArrayList<Pessoa>();
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM PROFESSOR ORDER BY NOME");
			 ResultSet rs = stmt.executeQuery();
			 while (rs.next()) {
					listaProfessor.add(montarObjeto(rs));
				    }
			 rs.close();
			    stmt.close();
			    connection.close();
			    return listaProfessor;
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}		}

	
	
	
	
	
	
			 public Pessoa buscarPorId(int id) {

					try {
					    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM PROFESSOR WHERE id = ?");
					    stmt.setInt(1, id);
					    ResultSet rs = stmt.executeQuery();

					    Pessoa professor = null;
					    if (rs.next()) {
						professor = montarObjeto(rs);
					    }

					    rs.close();
					    stmt.close();
					    connection.close();
					    return professor;
					} catch (SQLException e) {
					    throw new RuntimeException(e);
					}
				    }
			
			
			 public void alterar(Pessoa professor) {

					String sql = "UPDATE PROFESSOR SET NOME = ? , SIAPE = ? , EMAIL = ? , SENHA  = ? , TELEFONE = ? , CAMPUS = ? , REG_TRABALHO = ? , AREA = ? , CLASSE = ? , DIRETORIA = ? WHERE id = ?";

					try {

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
					  
					    stmt.setInt(11, professor.getId());
					    stmt.execute();
					    stmt.close();
					    connection.close();
					} catch (SQLException e) {
					    throw new RuntimeException(e);
					}
				    }
			
			
			
			
			
			public void remover(Pessoa professor) {

				try {
				    PreparedStatement stmt = connection.prepareStatement("DELETE FROM PROFESSOR WHERE id = ?");
				    stmt.setLong(1, professor.getId());
				    stmt.execute();
				    stmt.close();
				    connection.close();
				} catch (SQLException e) {
				    throw new RuntimeException(e);
				}

		}
			private Pessoa montarObjeto(ResultSet rs) throws SQLException {
				Pessoa professor = new Pessoa();
				professor.setId(rs.getInt("id"));
				professor.setNome(rs.getString("nome"));
				professor.setEmail(rs.getString("email"));
				professor.setSiape(rs.getString("siape"));
				professor.setSenha(rs.getString("senha"));
				professor.setTelefone(rs.getString("telefone"));
				professor.setCampus(rs.getString("campus"));
				professor.setRegTrabalho(rs.getString("reg_Trabalho"));
				professor.setClasse(rs.getString("classe"));
				professor.setDiretoria(rs.getString("diretoria"));
				professor.setArea(rs.getString("area"));
				return professor;

				
		}
}
    
    
    
    

    

