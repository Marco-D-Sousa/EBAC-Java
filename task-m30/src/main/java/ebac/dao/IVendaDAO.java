package ebac.dao;

import ebac.dao.generic.IGenericDAO;
import ebac.domain.Venda;
import ebac.exceptions.DAOException;
import ebac.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String>{

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
