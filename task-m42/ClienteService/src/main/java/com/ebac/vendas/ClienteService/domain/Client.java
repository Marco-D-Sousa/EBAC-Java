package com.ebac.vendas.ClienteService.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collation = "client")
public class Client {
    @Id
    private String id;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String name;

    @NotNull
    private Long tel;

    @Email
    @NotNull
    private String email;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String address;
}
