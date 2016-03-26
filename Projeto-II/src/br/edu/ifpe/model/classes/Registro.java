package br.edu.ifpe.model.classes;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Registro {
	
	
	
	@NotEmpty(message="O nome deve ser preenchido")
	@Size(max = 100, message="O nome deve deve ter um tamanho de no máximo 100 caracteres")
	private String nome;
	
	@NotEmpty(message="O siape deve ser preenchido")
	@Size(min = 5, max = 10, message="O siape deve deve ter um tamanho de no máximo de 10 caracteres e no minimo de 5 caracteres ")
	private String siape;
	
	private String semestre;
	private  int id;
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