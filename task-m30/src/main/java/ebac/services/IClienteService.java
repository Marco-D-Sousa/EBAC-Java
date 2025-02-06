package ebac.services;

import ebac.domain.Cliente;
import ebac.exceptions.DAOException;
import ebac.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long>{

    Cliente buscarPorCPF(Long cpf) throws DAOException;
}
