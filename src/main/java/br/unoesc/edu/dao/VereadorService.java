package br.unoesc.edu.dao;

import br.edu.unoesc.model.Vereador;

public class VereadorService extends GenericService<Vereador> {

	public Vereador buscar(Long codigo) {
		return em.find(Vereador.class, codigo);
	}

}
