package com.java.Dronefeeder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.java.Dronefeeder.model.Pedido;
import com.java.Dronefeeder.service.PedidoService;

@RestController
public class PedidoController {
  @Autowired
  private PedidoService pedidoService;

  @GetMapping("/pedidos")
  public List<Pedido> getAllPedidos() {
    return pedidoService.getAllPedidos();
  }

  @PostMapping("/pedidos/cliente/{clienteId}")
  public ResponseEntity<Pedido> criarPedido(@PathVariable long clienteId,
      @RequestBody Pedido pedido) {
    return ResponseEntity.ok().body(pedidoService.criarPedido(clienteId, pedido));
  }

}
