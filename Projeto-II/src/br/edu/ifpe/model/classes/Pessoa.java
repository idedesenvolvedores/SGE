package br.edu.ifpe.model.classes;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Pessoa {


	@NotEmpty(message="O siape deve ser preenchido")
	@Size(min = 5, max = 10, message="O código deve deve ter um tamanho máximo de 10 caracteres")
	private String siape;
	
	@NotEmpty(message="O nome deve ser preenchido")
	@Size(min = 1, max = 100, message="O nome deve deve ter um tamanho máximo de 100 caracteres")
	private String nome;	
	@NotEmpty(message="O email deve ser preenchido")
	@Size(min = 1, max = 100, message="O email deve deve ter um tamanho máximo de 50 caracteres")
	private String email;	
	private String campus;
	private String diretoria;
	private String telefone;
	private String area;
	private String classe;
	private String regime;

	
	public String getSiape() {
		return siape;
	}
	public void setSiape(String siape) {
		this.siape = siape;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getDiretoria() {
		return diretoria;
	}
	public void setDiretoria(String diretoria) {
		this.diretoria = diretoria;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getRegime() {
		return regime;
	}
	public void setRegime(String regime) {
		this.regime = regime;
	}

	
	
}