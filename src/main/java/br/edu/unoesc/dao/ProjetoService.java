package br.edu.unoesc.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.edu.unoesc.model.Projeto;

public class ProjetoService extends GenericService<Projeto> {

	public List<Projeto> buscaProjetoPorVereador(Long codigo) {
		conectar();
		try {
			TypedQuery<Projeto> query = em.createQuery("select p from Projeto p where p.vereador.codigo = ?1", Projeto.class);
			query.setParameter(1, codigo);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			desconectar();
		}
	}

	public void alterarProjetos(Projeto projeto) {
		Projeto proj = buscar(Projeto.class, projeto.getCodigo());
		proj.setApresentado(projeto.getApresentado());
		proj.setAprovado(projeto.getAprovado());
		proj.setNome(projeto.getNome());
		alterar(proj);
	}
}
