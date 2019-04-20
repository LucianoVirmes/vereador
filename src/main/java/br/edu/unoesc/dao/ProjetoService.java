package br.edu.unoesc.dao;

import java.util.List;

import javax.persistence.Query;

import br.edu.unoesc.model.Projeto;

public class ProjetoService extends GenericService<Projeto> {

	public List<Projeto> buscaProjetoPorVereador(Long codigo) {
		conectar();
		try {
			Query query = em.createQuery("select p from Projeto p where p.vereador.codigo = ?1", Projeto.class);
			query.setParameter(1, codigo);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			desconectar();
		}
	}
}