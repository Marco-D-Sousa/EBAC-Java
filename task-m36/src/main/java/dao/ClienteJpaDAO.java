package dao;

import dao.generic.GenericJpaDB1DAO;
import domain.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}
}
