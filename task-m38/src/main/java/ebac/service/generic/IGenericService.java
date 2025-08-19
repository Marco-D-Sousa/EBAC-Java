package ebac.service.generic;

import ebac.domain.Persistente;
import ebac.exceptions.DAOException;
import ebac.exceptions.MaisDeUmRegistroException;
import ebac.exceptions.TableException;
import ebac.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService<T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
