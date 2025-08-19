package com.ebac.vendas.ClienteService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com/ebac/vendas/ClienteService/repository")
public class MongoConfig {
}
