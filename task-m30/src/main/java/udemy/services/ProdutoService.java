package udemy.services;

import udemy.dao.IProdutoDAO;
import udemy.domain.Produto;
import udemy.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService{

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
