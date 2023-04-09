package com.java.Dronefeeder.dao;

import com.java.Dronefeeder.model.Video;

/**
 * Classe VideoDAO.
 */

public class VideoDao extends GenericDao<Video, Integer> {
  public VideoDao() {
    super(Video.class);
  }
}
