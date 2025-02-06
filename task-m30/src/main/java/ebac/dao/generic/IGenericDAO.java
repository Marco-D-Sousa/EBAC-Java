package ebac.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import ebac.dao.Persistente;
import ebac.exceptions.DAOException;
import ebac.exceptions.MaisDeUmRegistroException;
import ebac.exceptions.TableException;
import ebac.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO<T extends Persistente,E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(E valor) throws DAOException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
