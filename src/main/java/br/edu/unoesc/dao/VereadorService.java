package br.edu.unoesc.dao;

import br.edu.unoesc.model.Vereador;

public class VereadorService extends GenericService<Vereador> {

	public Integer qntProjetosApresentados() {
		return null;
	}

	public Integer qntProjetosAprovados() {
		return null;
	}

	public void adicionaProjetos(Vereador vereador) {
		Vereador v1 = buscar(Vereador.class, vereador.getCodigo());
		v1.setProjetos(vereador.getProjetos());
		alterar(v1);
	}

	public Float desempenho() {
		return null;
	}
}
