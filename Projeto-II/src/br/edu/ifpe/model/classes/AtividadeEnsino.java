package br.edu.ifpe.model.classes;

public class AtividadeEnsino {

	private int id;
	private String disciplina;
	private String curso;
	private int cargaHoraria;
	private PlanoTrabalho id_tipo_planoTrabalho;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public PlanoTrabalho getId_tipo_planoTrabalho() {
		return id_tipo_planoTrabalho;
	}

	public void setId_tipo_planoTrabalho(PlanoTrabalho id_tipo_planoTrabalho) {
		this.id_tipo_planoTrabalho = id_tipo_planoTrabalho;
	}

	
}
