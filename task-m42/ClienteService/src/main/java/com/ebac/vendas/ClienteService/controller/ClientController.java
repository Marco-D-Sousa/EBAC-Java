package com.ebac.vendas.ClienteService.controller;

import com.ebac.vendas.ClienteService.domain.Client;
import com.ebac.vendas.ClienteService.exception.EntityNotFoundException;
import com.ebac.vendas.ClienteService.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public record ClientController(ClientService service) {

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable String id) throws EntityNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody @Valid Client client) {
        return ResponseEntity.status(HttpStatus.OK).body(service.save(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@Valid Client client) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(client));
    }
}
