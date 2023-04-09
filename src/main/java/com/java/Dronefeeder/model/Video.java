package com.java.Dronefeeder.model;

import javax.persistence.Entity;

@Entity
public class Video {
  private Long id;
  private String video;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

}
