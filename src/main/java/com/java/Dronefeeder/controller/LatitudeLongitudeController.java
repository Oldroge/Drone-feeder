package com.java.Dronefeeder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.Dronefeeder.model.LatitudeLongitude;
import com.java.Dronefeeder.service.LatitudeLongitudeService;

@RestController
@RequestMapping("/latitude")
public class LatitudeLongitudeController {

  @Autowired
  private LatitudeLongitudeService latitudeLongitudeService;

  @GetMapping
  public ResponseEntity<List<LatitudeLongitude>> findAll() {
    return ResponseEntity.ok().body(latitudeLongitudeService.findAll());
  }

  @GetMapping("/{idLatitude}")
  public ResponseEntity<LatitudeLongitude> findById(@PathVariable Long idLatitude) {
    return ResponseEntity.ok().body(latitudeLongitudeService.findById(idLatitude));
  }
  
  @DeleteMapping("/{idLatitude}")
  public ResponseEntity<String> deleteById(@PathVariable Long idLatitude) {
    return ResponseEntity.ok().body(latitudeLongitudeService.deleteById(idLatitude));
  }
  
  @PostMapping
  public ResponseEntity<LatitudeLongitude> save(@RequestBody LatitudeLongitude retiradaEntrega) {
    return ResponseEntity.status(HttpStatus.CREATED).body(latitudeLongitudeService.save(retiradaEntrega));
  }
}