package com.java.Dronefeeder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Dronefeeder.model.LatitudeLongitude;
import com.java.Dronefeeder.repository.LatitudeLongitudeRepository;
import com.java.Dronefeeder.exception.NotFoundException;

@Service
public class LatitudeLongitudeService {
  @Autowired
  LatitudeLongitudeRepository latitudeLongitudeRepository;

  public List<LatitudeLongitude> findAll() {
    return latitudeLongitudeRepository.findAll();
  }

  public LatitudeLongitude findById(Long id) {
    if (latitudeLongitudeRepository.findById(id).isEmpty()) {
      throw new NotFoundException();
    } else {
      return latitudeLongitudeRepository.findById(id).get();
    }
  }
  
  public String deleteById(Long id) {
    if (latitudeLongitudeRepository.findById(id).isEmpty()) {
      throw new NotFoundException();
    } else {
      latitudeLongitudeRepository.deleteById(id);
      return "Localização deletada com sucesso!";
    }
  }
  
  public LatitudeLongitude save(LatitudeLongitude latitudeLongitude) {
    return latitudeLongitudeRepository.save(latitudeLongitude);
  }
}