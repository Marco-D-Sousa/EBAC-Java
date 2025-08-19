package ebac.dao;

import ebac.dao.generic.IGenericDAO;
import ebac.domain.Produto;

import java.util.List;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}