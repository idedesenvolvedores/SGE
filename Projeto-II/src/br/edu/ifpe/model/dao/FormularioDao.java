package br.edu.ifpe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.model.classes.AtividadeEnsino;
import br.edu.ifpe.model.classes.AtividadePedagogica;
import br.edu.ifpe.model.classes.Pessoa;
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

  //------------Salvar Pessoa---------------------------//
    
    public void salvarPessoa(Pessoa pessoa) {

	try {
	    String sql = "INSERT INTO PESSOA (SIAPE, NOME, EMAIL, TELEFONE, "
	    		+ "CAMPUS, REG_TRABALHO, AREA, CLASSE, DIRETORIA) "
	    		+ "VALUES (?,?,?,?,?,?,?,?,?)";
	    
	    PreparedStatement stmt = connection.prepareStatement(sql);
	    stmt.setInt(1, pessoa.getSiape());
	    stmt.setString(2, pessoa.getNome());
	    stmt.setString(3, pessoa.getEmail());
	    stmt.setString(4, pessoa.getTelefone());
	    stmt.setString(5, pessoa.getCampus());
	    stmt.setString(6, pessoa.getRegime());
	    stmt.setString(7, pessoa.getArea());
	    stmt.setString(8, pessoa.getClasse());
	    stmt.setString(9, pessoa.getDiretoria());

	    stmt.execute();
	    stmt.close();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
//----------------Salvar Atividade de Ensino -----------------//
    
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

  //-----------------Salvar Atividade Pedagógica --------------------
    
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
    
    
// ------------- Listar ----------------------- //
   
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

    // ----------- Listar Atividade Pedagógica ------------//
    
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

    // ----------- Listar Atividade de Ensino ------------//
    
    public List<AtividadeEnsino> listarAtividadeEnsino() {

	try {

	    List<AtividadeEnsino> listaAtividadeEnsino= new ArrayList<AtividadeEnsino>();
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

    // ----------- Listar Pessoa ------------//
    
    public List<Pessoa> listarPessoa() {

	try {

	    List<Pessoa> listaPessoa= new ArrayList<Pessoa>();
	    PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM PESSOA ORDER BY ID");

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
    

//--------- Remover --------------//
    
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

    //------ Remover Atividade Pedagógica --------//
    
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

    //------ Remover Atividade de Ensino --------//
    
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


 // --------- Alterar ------------//
     
     //------- Alterar Atividade de Ensino ----------//
     
     public void alterarAtividadeEnsino(AtividadeEnsino atividadeEnsino) {

 	String sql = "UPDATE ATIVIDADE_ENSINO SET DISCPILINA = ? , CURSO = ? , CARGA_HORARIA = ? WHERE id = ?";

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

     //------- Alterar Pessoa ----------//
     
     public void alterarPessoa(Pessoa pessoa) {

 	String sql = "UPDATE PESSOA SET SIAPE = ? , NOME = ? , EMAIL = ? , TELEFONE = ? , CAMPUS = ?  , REG_TRABALHO = ?  , AREA = ?  , CLASSE = ?  , DIRETORIA = ? WHERE id = ?";

 	try {

 	    PreparedStatement stmt = connection.prepareStatement(sql);
 	    stmt.setInt(1, pessoa.getSiape());
 	    stmt.setString(2, pessoa.getNome());
 	    stmt.setString(3, pessoa.getEmail());
 	    stmt.setString(4, pessoa.getTelefone());
 	    stmt.setString(5, pessoa.getCampus());
 	    stmt.setString(6, pessoa.getRegime());
 	    stmt.setString(7, pessoa.getArea());
 	    stmt.setString(8, pessoa.getClasse());
 	    stmt.setString(9, pessoa.getDiretoria());
 	    
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

     
// ------------- Buscar por id -------------------//
     
     //--------- Buscar por id Pessoa --------------//
     
     public Pessoa buscarPorIdPessoa(int id) {

    		try {
    		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM PESSOA WHERE id = ?");
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
     

     //--------- Buscar por id Atividade Pedagógica --------------//
     
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

     
     //--------- Buscar por id Atividade de Ensino --------------//
     
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
     
// ------------- Montando Objetos--------------------- //
    
    // ----------- Pessoa ------------//
 
    private Pessoa montarObjetoPessoa(ResultSet rs) throws SQLException {

    Pessoa pessoa = new Pessoa();
    pessoa.setSiape(rs.getInt("siape"));
    pessoa.setCampus(rs.getString("campus"));
    pessoa.setDiretoria(rs.getString("diretoria"));
    pessoa.setNome(rs.getString("nome"));
    pessoa.setEmail(rs.getString("email"));
    pessoa.setTelefone(rs.getString("telefone"));
    pessoa.setArea(rs.getString("area"));
    pessoa.setClasse(rs.getString("classe"));
    pessoa.setRegime(rs.getString("regime"));
    
	return pessoa;
    }
    
    // ----------- Plano de Trabalho ------------//

    private PlanoTrabalho montarObjetoPlanoTrabalho(ResultSet rs) throws SQLException {

    PlanoTrabalho planoTrabalho = new PlanoTrabalho();
    planoTrabalho.setId(rs.getInt("id"));
    planoTrabalho.setAtividadeApoio(rs.getString("atividadeApoiocampus"));
    planoTrabalho.setAtividadePesquisa(rs.getString("atividadePesquisa"));
    planoTrabalho.setAtividadeExtensao(rs.getString("atividadeExtensao"));
    
	return planoTrabalho;
    }
    
    // ----------- Atividade PedagÃ³gica ------------//

    private AtividadePedagogica montarObjetoAtividadePedagogica(ResultSet rs) throws SQLException {

    AtividadePedagogica atividadePedagogica = new AtividadePedagogica();
    atividadePedagogica.setId(rs.getInt("id"));
    atividadePedagogica.setAtividade(rs.getString("atividade"));
    atividadePedagogica.setPortaria(rs.getString("portaria"));
    
	return atividadePedagogica;
    }

    // ----------- Atividade de Ensino ------------//

    private AtividadeEnsino montarObjetoAtividadeEnsino(ResultSet rs) throws SQLException {

    AtividadeEnsino atividadeEnsino = new AtividadeEnsino();
    atividadeEnsino.setId(rs.getInt("id"));
    atividadeEnsino.setDisciplina(rs.getString("disciplina"));
    atividadeEnsino.setCurso(rs.getString("curso"));
    atividadeEnsino.setCargaHoraria(rs.getInt("cargaHoraria"));
    
	return atividadeEnsino;
    }

    
    
}
