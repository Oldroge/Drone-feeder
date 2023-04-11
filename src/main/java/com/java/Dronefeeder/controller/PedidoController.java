package com.java.Dronefeeder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
