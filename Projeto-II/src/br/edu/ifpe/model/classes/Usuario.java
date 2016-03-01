package br.edu.ifpe.model.classes;

public class Usuario {

	private int id;
	private String senha;
	private Pessoa siapefk;
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
	public Pessoa getSiapefk() {
		return siapefk;
	}
	public void setSiape(Pessoa siapefk) {
		this.siapefk = siapefk;
	}
	public TipoUsuario getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	
}
