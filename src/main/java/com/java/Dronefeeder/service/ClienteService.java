package com.java.Dronefeeder.service;

import java.util.Optional;
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

  public String deletaCliente(Long id) {
    clienteRepository.deleteById(id);
    return "Cliente removido";
  }

  public Optional<Cliente> clientePorId(Long id) {
    return clienteRepository.findById(id);
  }
}
