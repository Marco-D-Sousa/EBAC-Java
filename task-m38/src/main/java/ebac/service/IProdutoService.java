package ebac.service;

import ebac.domain.Produto;
import ebac.service.generic.IGenericService;

import java.util.List;

public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);
}
