package com.java.Dronefeeder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Dronefeeder.model.Drones;
import com.java.Dronefeeder.repository.DronesRepository;
import com.java.Dronefeeder.exception.NotFoundException;

@Service
public class DronesService {
  @Autowired
  DronesRepository dronesRepository;

  public List<Drones> findAll() {
    return dronesRepository.findAll();
  }

  public Drones findById(Long id) {
    if (dronesRepository.findById(id).isEmpty()) {
      throw new NotFoundException();
    } else {
      return dronesRepository.findById(id).get();
    }
  }
  
  public String deleteById(Long id) {
    if (dronesRepository.findById(id).isEmpty()) {
      throw new NotFoundException();
    } else {
        dronesRepository.deleteById(id);
      return "Drone deletado com sucesso!";
    }
  }
  
  public Drones save(Drones drone) {
    return dronesRepository.save(drone);
  }
}