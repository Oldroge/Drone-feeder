package com.java.Dronefeeder.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class RetiradaEntrega {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long retirada_entrega_id;
  private LocalDateTime dataRetirada;
  private LocalDateTime dataEntrega;
  private boolean isEntregue;
  @ManyToOne
  @JoinColumn(name = "latitude_longitude_id")
  private LatitudeLongitude latitudeLongitude;

  @OneToOne
  @JoinColumn(name = "video_id")
  private Video video;
  @ManyToOne
  @JoinColumn(name = "drones_id")
  private Drones drones;

  private String locRetirada;
  private String locEntrega;


  public String getLocRetirada() {
    return locRetirada;
  }

  public void setLocRetirada(String locRetirada) {
    this.locRetirada = locRetirada;
  }

  public String getLocEntrega() {
    return locEntrega;
  }

  public void setLocEntrega(String locEntrega) {
    this.locEntrega = locEntrega;
  }

  public Long getRetirada_entrega_id() {
    return retirada_entrega_id;
  }

  public void setRetirada_entrega_id(Long retirada_entrega_id) {
    this.retirada_entrega_id = retirada_entrega_id;
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
