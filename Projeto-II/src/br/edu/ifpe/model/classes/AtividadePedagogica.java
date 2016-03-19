package br.edu.ifpe.model.classes;

public class AtividadePedagogica {

	private int id;
	private String atividade;
	private String portaria;
	private PlanoTrabalho id_tipo_planoTrabalho;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public String getPortaria() {
		return portaria;
	}
	public void setPortaria(String portaria) {
		this.portaria = portaria;
	}

	public PlanoTrabalho getId_tipo_planoTrabalho() {
		return id_tipo_planoTrabalho;
	}

	public void setId_tipo_planoTrabalho(PlanoTrabalho id_tipo_planoTrabalho) {
		this.id_tipo_planoTrabalho = id_tipo_planoTrabalho;
	}
	
	
}
