package com.ebac.vendas.ProdutoService.controller;

import com.ebac.vendas.ProdutoService.domain.Product;
import com.ebac.vendas.ProdutoService.exception.ProductNotFoundException;
import com.ebac.vendas.ProdutoService.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public record ProductController(ProductService service) {

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable String code) throws ProductNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(code));
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody @Valid Product product) {
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String code) {
        service.delete(code);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@Valid Product product) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(product));
    }
}
