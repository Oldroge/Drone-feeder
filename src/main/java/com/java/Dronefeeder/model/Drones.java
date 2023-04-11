package com.java.Dronefeeder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Drones {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long drones_id;

  @ManyToOne
  @JoinColumn(name = "latitude_longitude_id")
  private LatitudeLongitude latitudeLongitude;

  public Long getDrones_id() {
    return drones_id;
  }

  public void setDrones_id(Long drones_id) {
    this.drones_id = drones_id;
  }

  public LatitudeLongitude getLatitudeLongitude() {
    return latitudeLongitude;
  }

  public void setLatitudeLongitude(LatitudeLongitude latitudeLongitude) {
    this.latitudeLongitude = latitudeLongitude;
  }



}
