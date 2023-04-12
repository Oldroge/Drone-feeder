package com.java.Dronefeeder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.Dronefeeder.model.RetiradaEntrega;
import com.java.Dronefeeder.repository.RetiradaEntregaRepository;
import com.java.Dronefeeder.exception.EntregaNaoEncontrada;

@Service
public class RetiradaEntregaService {
  @Autowired
  RetiradaEntregaRepository retiradaEntregaRepository;

  public List<RetiradaEntrega> findAll() {
    return retiradaEntregaRepository.findAll();
  }

  public RetiradaEntrega findById(Integer idRetiradaEntrega) {
    if (retiradaEntregaRepository.findById(idRetiradaEntrega).isEmpty()) {
      throw new EntregaNaoEncontrada();
    } else {
      return retiradaEntregaRepository.findById(idRetiradaEntrega).get();
    }
  }
}
