package br.edu.unoesc.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = Vereador.listarTodos, query = "select t from Vereador t") })
public class Vereador extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2373617700743489812L;

	private LocalDate dataAssociacao;

	@OneToMany(targetEntity = Projeto.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Projeto> projetos = new HashSet<Projeto>();
	
	@ManyToOne
	private Partido partido;
	
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

	public Set<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(Set<Projeto> projetos) {
		this.projetos = projetos;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Vereador(Long codigo, String nome) {
		super(codigo, nome);
	}

}
