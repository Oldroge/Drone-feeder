package com.java.Dronefeeder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.Dronefeeder.model.Cliente;
import com.java.Dronefeeder.model.Pedido;
import com.java.Dronefeeder.repository.PedidoRepository;
import com.java.Dronefeeder.repository.clienteRepository;

@Service
public class PedidoService {
  @Autowired
  PedidoRepository pedidoRepository;
  @Autowired
  clienteRepository clienteRepository;

  public List<Pedido> getAllPedidos() {
    return pedidoRepository.findAll();
  }

  public Pedido criarPedido(Long clienteId, Pedido pedido) {
    Cliente cliente = clienteRepository.findById(clienteId).get();
    cliente.adicionarPedido(pedido);
    System.out.println(cliente.getPedidos().get(0).getCliente().getNome());
    return pedidoRepository.save(pedido);
  }
}
