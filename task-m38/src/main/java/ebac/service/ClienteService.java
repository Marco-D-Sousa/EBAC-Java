package ebac.service;

import ebac.dao.IClienteDAO;
import ebac.domain.Cliente;
import ebac.exceptions.DAOException;
import ebac.exceptions.MaisDeUmRegistroException;
import ebac.exceptions.TableException;
import ebac.service.generic.GenericService;

import javax.inject.Inject;
import java.util.List;

public class ClienteService  extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;


    @Inject
    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Cliente> filtrarClientes(String query) {
        return clienteDAO.filtrarClientes(query);
    }
}
