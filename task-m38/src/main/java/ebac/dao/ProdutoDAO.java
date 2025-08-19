package ebac.dao;

import ebac.dao.generic.GenericDAO;
import ebac.domain.Produto;

import javax.persistence.TypedQuery;
import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super(Produto.class);
    }

    @Override
    public List<Produto> filtrarProdutos(String query) {
        TypedQuery<Produto> tpQuery =
                this.entityManager.createNamedQuery("Produto.findByNome", this.persistenteClass);
        tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
    }
}