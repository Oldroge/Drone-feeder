package com.java.Dronefeeder.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.Dronefeeder.model.Pedido;
import com.java.Dronefeeder.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
  @Autowired
  private PedidoService pedidoService;

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Pedido>> getPedidoPorId(@PathVariable Long id) {
    return ResponseEntity.ok().body(pedidoService.getPedidoPorId(id));
  }

  @DeleteMapping("/{id}")
  public String deletaPedidoPorId(@PathVariable Long id) {
    pedidoService.deletaPedidoPorId(id);
    return "Pedido deletado com sucesso!";
  }

  @PostMapping("/{clienteId}")
  public ResponseEntity<String> criarPedido(@PathVariable Long clienteId, Pedido pedido) {
    return ResponseEntity.ok().body(pedidoService.criarPedido(clienteId, pedido));
  }

}
