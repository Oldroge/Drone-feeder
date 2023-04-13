package com.java.Dronefeeder.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.Dronefeeder.model.Cliente;
import com.java.Dronefeeder.model.Pedido;
import com.java.Dronefeeder.repository.ClienteRepository;
import com.java.Dronefeeder.repository.PedidoRepository;

@Service
public class PedidoService {
  @Autowired
  PedidoRepository pedidoRepository;
  ClienteRepository clienteRepository;

  public Optional<Pedido> getPedidoPorId(Long id) {
    return pedidoRepository.findById(id);
  }

  public void deletaPedidoPorId(Long id) {
    pedidoRepository.deleteById(id);
  }

  public String criarPedido(Long clienteId, Pedido pedido) {
    Cliente cliente = clienteRepository.findById(clienteId).get();
    if (cliente.getClientes_id() == pedido.getCliente().getClientes_id()) {
      pedidoRepository.save(pedido);
      cliente.adicionaPedido(pedido);
      return "Pedido adicionado com sucesso!";
    }
    return "Não foi possível adicionar o pedido";
  }

}
