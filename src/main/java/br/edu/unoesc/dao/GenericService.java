package br.edu.unoesc.dao;

import java.util.List;

import br.edu.unoesc.util.Conexao;

public class GenericService<T> extends Conexao implements CrudDao<T> {

	@Override
	public void inserir(T dado) {
		conectar();
		try {
			et.begin();
			em.persist(dado);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		} finally {
			desconectar();
		}
	}

	@Override
	public void remover(T dado) {
		conectar();
		try {
			et.begin();
			em.persist(dado);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		} finally {
			desconectar();
		}
	}

	@Override
	public List<T> listar(Class<T> classe) {
		conectar();
		try {
			return em.createQuery("Select c from classe").setParameter("classe", classe).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			desconectar();
		}
	}

}
