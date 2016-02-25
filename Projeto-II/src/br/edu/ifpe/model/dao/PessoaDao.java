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

    public void salvar(Pessoa pessoa) {

	try {
	    String sql = "INSERT INTO PESSOA (NOME,SIAPE,EMAIL,SENHA,TELEFONE,CAMPUS,REG_TRABALHO,AREA,CLASSE,DIRETORIA) VALUES (?,?,?,?,?,?,?,?,?,?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, pessoa.getNome());
	    stmt.setString(2, pessoa.getSiape());
	    stmt.setString(3, pessoa.getEmail());
	    stmt.setString(4, pessoa.getSenha());
	    stmt.setString(5, pessoa.getTelefone());
	    stmt.setString(6, pessoa.getCampus());
	    stmt.setString(7, pessoa.getRegTrabalho());
	    stmt.setString(8, pessoa.getArea());
	    stmt.setString(9, pessoa.getClasse());
	    stmt.setString(10, pessoa.getDiretoria());
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
			List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM PESSOA ORDER BY NOME");
			 ResultSet rs = stmt.executeQuery();
			 while (rs.next()) {
					listaPessoa.add(montarObjeto(rs));
				    }
			 rs.close();
			    stmt.close();
			    connection.close();
			    return listaPessoa;
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}		}

	
	
	
	
	
	
			 public Pessoa buscarPorId(int id) {

					try {
					    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM PESSOA WHERE id = ?");
					    stmt.setInt(1, id);
					    ResultSet rs = stmt.executeQuery();

					    Pessoa pessoa = null;
					    if (rs.next()) {
						pessoa = montarObjeto(rs);
					    }

					    rs.close();
					    stmt.close();
					    connection.close();
					    return pessoa;
					} catch (SQLException e) {
					    throw new RuntimeException(e);
					}
				    }
			
			
			 public void alterar(Pessoa pessoa) {

					String sql = "UPDATE PESSOA SET NOME = ? , SIAPE = ? , EMAIL = ? , SENHA  = ? , TELEFONE = ? , CAMPUS = ? , REG_TRABALHO = ? , AREA = ? , CLASSE = ? , DIRETORIA = ? WHERE id = ?";

					try {

					    PreparedStatement stmt = connection.prepareStatement(sql);
					    stmt.setString(1, pessoa.getNome());
					    stmt.setString(2, pessoa.getSiape());
					    stmt.setString(3, pessoa.getEmail());
					    stmt.setString(4, pessoa.getSenha());
					    stmt.setString(5, pessoa.getTelefone());
					    stmt.setString(6, pessoa.getCampus());
					    stmt.setString(7, pessoa.getRegTrabalho());
					    stmt.setString(8, pessoa.getArea());
					    stmt.setString(9, pessoa.getClasse());
					    stmt.setString(10, pessoa.getDiretoria());
					  
					    stmt.setInt(11, pessoa.getId());
					    stmt.execute();
					    stmt.close();
					    connection.close();
					} catch (SQLException e) {
					    throw new RuntimeException(e);
					}
				    }
			
			
			
			
			
			public void remover(Pessoa pessoa) {

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
			private Pessoa montarObjeto(ResultSet rs) throws SQLException {
				Pessoa pessoa = new Pessoa();
				pessoa.setId(rs.getInt("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setSiape(rs.getString("siape"));
				pessoa.setSenha(rs.getString("senha"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoa.setCampus(rs.getString("campus"));
				pessoa.setRegTrabalho(rs.getString("reg_Trabalho"));
				pessoa.setClasse(rs.getString("classe"));
				pessoa.setDiretoria(rs.getString("diretoria"));
				pessoa.setArea(rs.getString("area"));
				return pessoa;

				
		}
}
    
    
    
    

    

