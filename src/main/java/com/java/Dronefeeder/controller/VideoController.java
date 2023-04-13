package com.java.Dronefeeder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.Dronefeeder.model.Video;
import com.java.Dronefeeder.service.VideoService;

@RestController
@RequestMapping("/video")
public class VideoController {

  @Autowired
  private VideoService videoService;

  @GetMapping
  public ResponseEntity<List<Video>> findAll() {
    return ResponseEntity.ok().body(videoService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Video> findById(@PathVariable Long id) {
    return ResponseEntity.ok().body(videoService.findById(id));
  }
  
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteById(@PathVariable Long id) {
    return ResponseEntity.ok().body(videoService.deleteById(id));
  }
  
  @PostMapping
  public ResponseEntity<Video> save(@RequestBody Video video) {
    return ResponseEntity.ok().body(videoService.save(video));
  }
}