package com.java.Dronefeeder.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.Dronefeeder.model.Pedido;
import com.java.Dronefeeder.repository.PedidoRepository;

@Service
public class PedidoService {
  @Autowired
  PedidoRepository pedidoRepository;

  public Optional<Pedido> getPedidoPorId(Long id) {
    return pedidoRepository.findById(id);
  }

  public void deletaPedidoPorId(Long id) {
    pedidoRepository.deleteById(id);
  }

}
