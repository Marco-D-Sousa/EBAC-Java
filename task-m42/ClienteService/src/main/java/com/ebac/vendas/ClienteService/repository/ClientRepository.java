package com.ebac.vendas.ClienteService.repository;

import com.ebac.vendas.ClienteService.domain.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}
