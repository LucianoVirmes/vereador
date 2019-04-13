package br.edu.unoesc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Partido.listarTodos, query = "Select p from Partido p") })
public class Partido implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -339637566640761163L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long numero;
	private String nome;

	public static final String listarTodos = "buscarTodosPartidos";

	public Partido() {
	}

	public Partido(Long id, Long numero, String nome) {
		super();
		this.id = id;
		this.numero = numero;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
