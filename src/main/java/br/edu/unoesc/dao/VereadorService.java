package br.edu.unoesc.dao;

import br.edu.unoesc.model.Projeto;
import br.edu.unoesc.model.Vereador;

public class VereadorService extends GenericService<Vereador> {

	public Vereador buscar(Long codigo) {
		return em.find(Vereador.class, codigo);
	}
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
