package br.edu.unoesc.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Vereador.listarTodos, query = "select t from Vereador t") })
public class Vereador extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2373617700743489812L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codigo;
	private LocalDate dataAssociacao;

	public static final String listarTodos = "buscarTodosVereadores";

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataAssociacao() {
		return dataAssociacao;
	}

	public void setDataAssociacao(LocalDate dataAssociacao) {
		this.dataAssociacao = dataAssociacao;
	}

	public Vereador(Long codigo, String nome, Long codigo2, LocalDate dataAssociacao) {
		super(codigo, nome);
		codigo = codigo2;
		this.dataAssociacao = dataAssociacao;
	}

	public Vereador() {
	}

	public Vereador(Long codigo, String nome) {
		super(codigo, nome);
	}

}
