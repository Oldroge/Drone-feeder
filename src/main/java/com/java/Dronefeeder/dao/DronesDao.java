package com.java.Dronefeeder.dao;

import com.java.Dronefeeder.model.Drones;

/**
 * Classe DronesDAO.
 */

public class DronesDao extends GenericDao<Drones, Integer> {
  public DronesDao() {
    super(Drones.class);
  }
}
