package com.ebac.vendas.ProdutoService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com/ebac/vendas/ProdutoService/repository")
public class MongoConfig {
}
