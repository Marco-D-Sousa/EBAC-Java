package ebac.service;

import ebac.dao.generic.IGenericDAO;
import ebac.domain.Venda;
import ebac.exceptions.DAOException;
import ebac.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaService extends IGenericDAO<Venda, Long> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public Venda consultarComCollection(Long id);

}
