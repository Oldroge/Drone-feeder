package com.java.Dronefeeder.dao;

import com.java.Dronefeeder.model.Pedido;

/**
 * Classe PedidoDAO.
 */

public class PedidoDao extends GenericDao<Pedido, Integer> {
  public PedidoDao() {
    super(Pedido.class);
  }
}
