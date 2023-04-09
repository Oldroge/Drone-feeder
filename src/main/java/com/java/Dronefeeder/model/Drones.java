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
  private Long id;

  @ManyToOne
  @JoinColumn(name = "idLatitudeLongitude")
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
