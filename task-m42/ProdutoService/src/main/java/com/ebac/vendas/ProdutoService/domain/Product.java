package com.ebac.vendas.ProdutoService.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Document(collection = "product")
public class Product {

    @Id
    private String code;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String name;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String description;

    @NotNull
    private BigDecimal price;
}
