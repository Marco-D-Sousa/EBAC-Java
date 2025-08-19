package ebac.dao;

import ebac.dao.generic.IGenericDAO;
import ebac.domain.Cliente;

import java.util.List;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    List<Cliente> filtrarClientes(String query);
}
