package com.java.Dronefeeder.dao;

import com.java.Dronefeeder.model.Cliente;

/**
 * Classe ClienteDAO.
 */

public class ClienteDao extends GenericDao<Cliente, Integer> {
  public ClienteDao() {
    super(Cliente.class);
  }
}
