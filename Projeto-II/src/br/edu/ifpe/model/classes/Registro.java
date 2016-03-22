package br.edu.ifpe.model.classes;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Registro {
	
	
	private  int id;
	private String nome;
	private String siape;
	private String semestre;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataEntrega;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSiape() {
		return siape;
	}
	public void setSiape(String siape) {
		this.siape = siape;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
}