package ebac.dao;

import ebac.dao.generic.GenericDAO;
import ebac.domain.Cliente;

import javax.persistence.TypedQuery;
import java.util.List;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super(Cliente.class);
    }

    @Override
    public List<Cliente> filtrarClientes(String query) {
        TypedQuery<Cliente> tpQuery =
                this.entityManager.createNamedQuery("Cliente.findByNome", this.persistenteClass);
        tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();

    }
}
