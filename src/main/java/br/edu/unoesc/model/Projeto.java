package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projeto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codigo;
	private String nome;
	private Boolean aprovado;
	private Boolean apresentado;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	public Boolean getApresentado() {
		return apresentado;
	}

	public void setApresentado(Boolean apresentado) {
		this.apresentado = apresentado;
	}

}
