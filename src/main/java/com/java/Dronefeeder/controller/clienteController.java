package com.java.Dronefeeder.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.Dronefeeder.model.Cliente;
import com.java.Dronefeeder.repository.ClienteRepository;
import com.java.Dronefeeder.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class clienteController {
  @Autowired
  ClienteRepository clienteRepository;

  @Autowired
  ClienteService clienteService;

  @PostMapping("/novo")
  public ResponseEntity<Cliente> criarNovoCliente(@RequestBody Cliente novoCliente) {
    return ResponseEntity.ok().body(clienteService.criarNovoCliente(novoCliente));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteCliente(@PathVariable Long id) {
    return ResponseEntity.ok().body(clienteService.deletaCliente(id));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Cliente>> clientePorId(@PathVariable Long id) {
    return ResponseEntity.ok().body(clienteService.clientePorId(id));
  }
}
