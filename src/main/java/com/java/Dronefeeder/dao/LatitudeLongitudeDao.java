package com.java.Dronefeeder.dao;

import com.java.Dronefeeder.model.LatitudeLongitude;

/**
 * Classe LatitudeLongitudeDAO.
 */

public class LatitudeLongitudeDao extends GenericDao<LatitudeLongitude, Integer> {
  public LatitudeLongitudeDao() {
    super(LatitudeLongitude.class);
  }
}
