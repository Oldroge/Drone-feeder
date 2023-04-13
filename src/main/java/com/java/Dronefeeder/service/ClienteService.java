package com.java.Dronefeeder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.Dronefeeder.model.Cliente;
import com.java.Dronefeeder.repository.ClienteRepository;

@Service
public class ClienteService {
  @Autowired
  ClienteRepository clienteRepository;

  public Cliente criarNovoCliente(Cliente novoCliente) {
    return clienteRepository.save(novoCliente);
  }

}
