package com.java.Dronefeeder.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;

@Entity
public class RetiradaEntrega {
  private Long id;
  private LocalDateTime dataRetirada;
  private LocalDateTime dataEntrega;
  private boolean isEntregue;
  private LatitudeLongitude latitudeLongitude;
  private Video video;
  private Pedido pedido;
  private Drones drones;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getDataRetirada() {
    return dataRetirada;
  }

  public void setDataRetirada(LocalDateTime dataRetirada) {
    this.dataRetirada = dataRetirada;
  }

  public LocalDateTime getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(LocalDateTime dataEntrega) {
    this.dataEntrega = dataEntrega;
  }

  public Video getVideo() {
    return video;
  }

  public void setVideo(Video video) {
    this.video = video;
  }

  public Pedido getPedido() {
    return pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public Drones getDrones() {
    return drones;
  }

  public void setDrones(Drones drones) {
    this.drones = drones;
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
