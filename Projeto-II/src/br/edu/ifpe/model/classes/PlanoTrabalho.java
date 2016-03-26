package br.edu.ifpe.model.classes;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PlanoTrabalho {

	@NotEmpty(message="O campo ATIVIDADES DE APOIO AO ENSINO deve ser preenchido")
	@Size(max = 200, message="O campo ATIVIDADES DE APOIO AO ENSINO deve deve ter um tamanho máximo de 200 caracteres")
	private String atividadeApoio;
	
	@NotEmpty(message="O campo ATIVIDADES DE PESQUISA deve ser preenchido")
	@Size(max = 200, message="O campo ATIVIDADES DE PESQUISA deve deve ter um tamanho máximo de 200 caracteres")
	private String atividadePesquisa;
	
	@NotEmpty(message="O campo ATIVIDADES DE EXTENSÃO deve ser preenchido")
	@Size(max = 200, message="O campo ATIVIDADES DE EXTENSÃO deve deve ter um tamanho máximo de 200 caracteres")
	private String atividadeExtensao;
	
	private Pessoa idPessoa;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAtividadeApoio() {
		return atividadeApoio;
	}
	public void setAtividadeApoio(String atividadeApoio) {
		this.atividadeApoio = atividadeApoio;
	}
	public String getAtividadePesquisa() {
		return atividadePesquisa;
	}
	public void setAtividadePesquisa(String atividadePesquisa) {
		this.atividadePesquisa = atividadePesquisa;
	}
	public String getAtividadeExtensao() {
		return atividadeExtensao;
	}
	public void setAtividadeExtensao(String atividadeExtensao) {
		this.atividadeExtensao = atividadeExtensao;
	}
	public Pessoa getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}	
	
}
