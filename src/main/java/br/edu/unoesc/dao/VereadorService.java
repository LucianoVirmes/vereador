package br.edu.unoesc.dao;


import javax.persistence.Query;

import br.edu.unoesc.model.Projeto;
import br.edu.unoesc.model.Vereador;

public class VereadorService extends GenericService<Vereador> {

	public Long qntProjetosApresentados(Long codigo) {
		conectar();
		try {
			Query query = em.createQuery("select count(p)  from Projeto p where p.vereador.codigo = ?1 AND p.aprovado = 1");
			query.setParameter(1, codigo);
			return (Long)query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			desconectar();
		}
	}

	public Long qntProjetosAprovados(Long codigo) {
		conectar();
		try {
			Query query = em.createQuery("select count(p) from Projeto p where p.vereador.codigo = ?1 AND p.apresentado = 1");
			query.setParameter(1, codigo);
			return (Long) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			desconectar();
		}
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
