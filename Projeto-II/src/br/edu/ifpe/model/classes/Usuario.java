package br.edu.ifpe.model.classes;

public class Usuario {

	private int id;
	private String senha;
	private Cabecalho siapefk;
	private TipoUsuario idTipoUsuario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Cabecalho getSiapefk() {
		return siapefk;
	}
	public void setSiape(Cabecalho siapefk) {
		this.siapefk = siapefk;
	}
	public TipoUsuario getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	
}
