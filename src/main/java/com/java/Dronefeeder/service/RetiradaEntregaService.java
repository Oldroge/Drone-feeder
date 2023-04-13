package com.java.Dronefeeder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Dronefeeder.model.RetiradaEntrega;
import com.java.Dronefeeder.repository.RetiradaEntregaRepository;
import com.java.Dronefeeder.exception.NotFoundException;

@Service
public class RetiradaEntregaService {
  @Autowired
  RetiradaEntregaRepository retiradaEntregaRepository;

  public List<RetiradaEntrega> findAll() {
    return retiradaEntregaRepository.findAll();
  }

  public RetiradaEntrega findById(Long idRetiradaEntrega) {
    if (retiradaEntregaRepository.findById(idRetiradaEntrega).isEmpty()) {
      throw new NotFoundException();
    } else {
      return retiradaEntregaRepository.findById(idRetiradaEntrega).get();
    }
  }
  
  public String deleteById(Long idRetiradaEntrega) {
    if (retiradaEntregaRepository.findById(idRetiradaEntrega).isEmpty()) {
      throw new NotFoundException();
    } else {
      retiradaEntregaRepository.deleteById(idRetiradaEntrega);
      return "Entrega deletada com sucesso!";
    }
  }
  
  public RetiradaEntrega save(RetiradaEntrega retiradaEntrega) {
    return retiradaEntregaRepository.save(retiradaEntrega);
  }
}