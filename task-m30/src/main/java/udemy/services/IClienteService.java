package udemy.services;

import udemy.domain.Cliente;
import udemy.exceptions.DAOException;
import udemy.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;
}
