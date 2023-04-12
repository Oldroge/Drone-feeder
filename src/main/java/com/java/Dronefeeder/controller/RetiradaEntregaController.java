package com.java.Dronefeeder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.Dronefeeder.model.RetiradaEntrega;
import com.java.Dronefeeder.service.RetiradaEntregaService;

@RestController
@RequestMapping("/entrega")
public class RetiradaEntregaController {

  @Autowired
  private RetiradaEntregaService retiradaEntregaService;

  @GetMapping
  public ResponseEntity<List<RetiradaEntrega>> findAll() {
    return ResponseEntity.ok().body(retiradaEntregaService.findAll());
  }

  @GetMapping("/{idEntrega}")
  public ResponseEntity<RetiradaEntrega> findById(Integer idEntrega) {
    return ResponseEntity.ok().body(retiradaEntregaService.findById(idEntrega));
  }
}