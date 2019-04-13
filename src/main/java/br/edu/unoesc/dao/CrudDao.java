package br.edu.unoesc.dao;

import java.util.List;

public interface CrudDao<T> {

	void inserir(T dado);
	void remover(T dado);
	List<T> listar(Class<T> classe);
	
}
