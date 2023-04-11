package com.java.Dronefeeder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LatitudeLongitude {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long latitude_longitude_id;
  private String latitude;
  private String longitude;

  public Long getLatitude_longitude_id() {
    return latitude_longitude_id;
  }

  public void setLatitude_longitude_id(Long latitude_longitude_id) {
    this.latitude_longitude_id = latitude_longitude_id;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

}
