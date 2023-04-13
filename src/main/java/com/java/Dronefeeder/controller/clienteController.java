package com.java.Dronefeeder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
}
