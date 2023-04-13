package com.java.Dronefeeder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Dronefeeder.model.Video;
import com.java.Dronefeeder.repository.VideoRepository;
import com.java.Dronefeeder.exception.NotFoundException;

@Service
public class VideoService {
  @Autowired
  VideoRepository videoRepository;

  public List<Video> findAll() {
    return videoRepository.findAll();
  }

  public Video findById(Long id) {
    if (videoRepository.findById(id).isEmpty()) {
      throw new NotFoundException();
    } else {
      return videoRepository.findById(id).get();
    }
  }
  
  public String deleteById(Long id) {
    if (videoRepository.findById(id).isEmpty()) {
      throw new NotFoundException();
    } else {
        videoRepository.deleteById(id);
      return "Video deletado com sucesso!";
    }
  }
  
  public Video save(Video video) {
    return videoRepository.save(video);
  }
}