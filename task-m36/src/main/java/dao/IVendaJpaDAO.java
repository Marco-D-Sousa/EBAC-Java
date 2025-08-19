package dao;

import dao.generic.IGenericJpaDAO;
import domain.VendaJpa;
import exceptions.DAOException;
import exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long> {

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

	public VendaJpa consultarComCollection(Long id);
}
