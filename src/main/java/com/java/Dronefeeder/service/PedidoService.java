package com.java.Dronefeeder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.java.Dronefeeder.model.Pedido;
import com.java.Dronefeeder.repository.PedidoRepository;

@Service
public class PedidoService {
  @Autowired
  PedidoRepository pedidoRepository;

  @Bean
  public List<Pedido> getAllPedidos() {
    return pedidoRepository.findAll();
  }

}
