package udemy.services;

import udemy.dao.IClienteDAO;
import udemy.domain.Cliente;
import udemy.exceptions.DAOException;
import udemy.exceptions.MaisDeUmRegistroException;
import udemy.exceptions.TableException;
import udemy.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
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
}
