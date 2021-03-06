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
	public List<T> listar(String query, Class<T> classe) {
		conectar();
		try {
			return em.createNamedQuery(query, classe).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			desconectar();
		}
	}

	@Override
	public T buscar(Class<T> classe, Long codigo) {
		conectar();
		try {
			return em.find(classe, codigo);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			desconectar();
		}
	}

	@Override
	public void alterar(T dado) {
		conectar();
		try {
			et.begin();
			em.merge(dado);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		} finally {
			desconectar();
		}
	}

}
