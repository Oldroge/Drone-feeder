package com.java.Dronefeeder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Dronefeeder.model.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {}
