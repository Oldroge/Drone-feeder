package com.java.Dronefeeder.model;

import javax.persistence.Entity;

@Entity
public class Drones {
  private Long id;
  private LatitudeLongitude latitudeLongitude;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LatitudeLongitude getLatitudeLongitude() {
    return latitudeLongitude;
  }

  public void setLatitudeLongitude(LatitudeLongitude latitudeLongitude) {
    this.latitudeLongitude = latitudeLongitude;
  }



}
