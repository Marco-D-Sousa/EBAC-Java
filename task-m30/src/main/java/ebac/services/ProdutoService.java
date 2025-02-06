package ebac.services;

import ebac.dao.IProdutoDAO;
import ebac.domain.Produto;
import ebac.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }
}
