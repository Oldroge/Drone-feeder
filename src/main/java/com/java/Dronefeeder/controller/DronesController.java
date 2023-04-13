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
import com.java.Dronefeeder.model.Drones;
import com.java.Dronefeeder.service.DronesService;

@RestController
@RequestMapping("/drones")
public class DronesController {

  @Autowired
  private DronesService dronesService;

  @GetMapping
  public ResponseEntity<List<Drones>> findAll() {
    return ResponseEntity.ok().body(dronesService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Drones> findById(@PathVariable Long id) {
    return ResponseEntity.ok().body(dronesService.findById(id));
  }
  
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteById(@PathVariable Long id) {
    return ResponseEntity.ok().body(dronesService.deleteById(id));
  }
  
  @PostMapping
  public ResponseEntity<Drones> save(@RequestBody Drones drone) {
    return ResponseEntity.status(HttpStatus.CREATED).body(dronesService.save(drone));
  }
}