package com.java.Dronefeeder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Dronefeeder.model.Drones;

@Repository
public interface DronesRepository extends JpaRepository<Drones, Long> {}
