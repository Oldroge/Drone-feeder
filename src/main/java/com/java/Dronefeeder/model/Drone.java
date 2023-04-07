package com.java.Dronefeeder.model;

import javax.persistence.Entity;

@Entity
public class Drone {
  private Long id;
  private LatitudeLongitude latitudeLongitude;
  private Entrega entrega;

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

  public Entrega getEntrega() {
    return entrega;
  }

  public void setEntrega(Entrega entrega) {
    this.entrega = entrega;
  }



}
