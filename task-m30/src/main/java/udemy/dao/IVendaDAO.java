package udemy.dao;

import udemy.dao.generic.IGenericDAO;
import udemy.domain.Venda;
import udemy.exceptions.DAOException;
import udemy.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
