package com.java.Dronefeeder.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;

@Entity
public class Entrega {
  private Long id;
  private LocalDateTime dataHora;
  private boolean isEntregue;
  private LatitudeLongitude latitudeLongitude;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public boolean isEntregue() {
    return isEntregue;
  }

  public void setEntregue(boolean isEntregue) {
    this.isEntregue = isEntregue;
  }

  public LatitudeLongitude getLatitudeLongitude() {
    return latitudeLongitude;
  }

  public void setLatitudeLongitude(LatitudeLongitude latitudeLongitude) {
    this.latitudeLongitude = latitudeLongitude;
  }

}
