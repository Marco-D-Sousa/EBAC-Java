package com.ebac.vendas.ProdutoService.repository;


import com.ebac.vendas.ProdutoService.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
