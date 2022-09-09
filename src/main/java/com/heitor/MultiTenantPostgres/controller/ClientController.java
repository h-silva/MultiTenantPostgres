package com.heitor.MultiTenantPostgres.controller;

import com.heitor.MultiTenantPostgres.model.Client;
import com.heitor.MultiTenantPostgres.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<Client>> getAll() {
        return ResponseEntity.ok(clientRepository.findAllByActive(Boolean.TRUE));
    }
}
