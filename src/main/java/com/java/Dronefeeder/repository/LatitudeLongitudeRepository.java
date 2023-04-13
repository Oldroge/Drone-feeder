package com.java.Dronefeeder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.java.Dronefeeder.model.LatitudeLongitude;

@Repository
public interface LatitudeLongitudeRepository extends JpaRepository<LatitudeLongitude, Long> {}
