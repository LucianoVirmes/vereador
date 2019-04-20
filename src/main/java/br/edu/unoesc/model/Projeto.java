package br.edu.unoesc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projeto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4490346393567624946L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codigo;
	private String nome;
	private Boolean aprovado;
	private Boolean apresentado;

	@ManyToOne
	private Vereador vereador;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public Projeto(Long codigo, String nome, Boolean aprovado, Boolean apresentado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.aprovado = aprovado;
		this.apresentado = apresentado;
	}

	public Vereador getVereador() {
		return vereador;
	}

	public void setVereador(Vereador vereador) {
		this.vereador = vereador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apresentado == null) ? 0 : apresentado.hashCode());
		result = prime * result + ((aprovado == null) ? 0 : aprovado.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((vereador == null) ? 0 : vereador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (apresentado == null) {
			if (other.apresentado != null)
				return false;
		} else if (!apresentado.equals(other.apresentado))
			return false;
		if (aprovado == null) {
			if (other.aprovado != null)
				return false;
		} else if (!aprovado.equals(other.aprovado))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (vereador == null) {
			if (other.vereador != null)
				return false;
		} else if (!vereador.equals(other.vereador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Projeto [codigo=" + codigo + ", nome=" + nome + ", aprovado=" + aprovado + ", apresentado="
				+ apresentado + ", vereador=" + vereador + "]";
	}

	public Projeto() {
	}

}
