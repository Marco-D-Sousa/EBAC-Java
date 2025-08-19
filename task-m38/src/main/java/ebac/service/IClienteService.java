package ebac.service;

import ebac.domain.Cliente;
import ebac.exceptions.DAOException;
import ebac.service.generic.IGenericService;

import java.util.List;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

    List<Cliente> filtrarClientes(String query);
}
