package br.edu.unoesc.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Vereador extends Pessoa {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long codigo;
	
	private LocalDate dataAssociacao;
	
	public Integer qntProjetosApresentados() {
		return null;
	}
	public Integer qntProjetosAprovados() {
		return null;
	}
	public void adicionaProjetos(Projeto projeto) {
		
	}
	public Float desempenho() {
		return null;
	}
	
}
