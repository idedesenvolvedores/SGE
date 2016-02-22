package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpe.model.classes.AtividadeEnsino;
import br.edu.ifpe.model.classes.AtividadePedagogica;
import br.edu.ifpe.model.classes.Cabecalho;
import br.edu.ifpe.model.classes.PlanoTrabalho;
import br.edu.ifpe.util.ConnectionFactory;

public class FormularioDao {

    private Connection connection;

    public FormularioDao() {

	try {
	    this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

  //------------------------------------------------------------------
    
    public void salvarCabecalho(Cabecalho cabecalho) {

	try {
	    String sql = "INSERT INTO PROFESSOR (NOME, SIAPE, EMAIL, TELEFONE, "
	    		+ "CAMPUS, REG_TRABALHO, AREA, CLASSE, DIRETORIA) "
	    		+ "VALUES (?,?,?,?,?,?,?,?,?)";
	    
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, cabecalho.getProfessor());
	    stmt.setString(2, cabecalho.getSiape());
	    stmt.setString(3, cabecalho.getEmail());
	    stmt.setString(4, cabecalho.getTelefone());
	    stmt.setString(5, cabecalho.getCampus());
	    stmt.setString(6, cabecalho.getRegime());
	    stmt.setString(7, cabecalho.getArea());
	    stmt.setString(8, cabecalho.getClasse());
	    stmt.setString(9, cabecalho.getDiretoria());

	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
//------------------------------------------------------------------
    
    public void salvarAtividadeEnsino(AtividadeEnsino atividade) {

	try {
	    String sql = "INSERT INTO ATIVIDADE_ENSINO (DISCIPLINA, CURSO, CARGA_HORARIA)" + "VALUES (?,?,?)";
	    
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setString(1, atividade.getDisciplina());
	    stmt.setString(2, atividade.getCurso());
	    stmt.setInt(3, atividade.getCargaHoraria());

	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

  //------------------------------------------------------------------
    
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

  //------------------------------------------------------------------
    
    public void salvarAtividadePedagogica(AtividadePedagogica atividade) {
		try {
		    String sql = "INSERT INTO ATIVIDADE_PEDAGOGICA (ATIVIDADE, PORTARIA)" + "VALUES (?,?)";
		    
		    PreparedStatement stmt = connection.prepareStatement(sql);
		    stmt.setString(1, atividade.getAtividade());
		    stmt.setString(2, atividade.getPortaria());

		    stmt.execute();
		    stmt.close();
		    connection.close();
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}

		
	}
    
    //------------------------------------------------------------------
    
}
