package br.edu.unoesc.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = Vereador.listarTodos, query = "select t from Vereador t") })
public class Vereador extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2373617700743489812L;

	private LocalDate dataAssociacao;

	public static final String listarTodos = "buscarTodosVereadores";

	public LocalDate getDataAssociacao() {
		return dataAssociacao;
	}

	public void setDataAssociacao(LocalDate dataAssociacao) {
		this.dataAssociacao = dataAssociacao;
	}

	public Vereador(Long codigo, String nome, LocalDate dataAssociacao) {
		super(codigo, nome);
		this.dataAssociacao = dataAssociacao;
	}

	public Vereador() {
	}

	public Vereador(Long codigo, String nome) {
		super(codigo, nome);
	}

}
