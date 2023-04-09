package com.java.Dronefeeder.model;

import javax.persistence.Entity;

@Entity
public class Pedido {
  private Long id;
  Cliente idCliente;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cliente getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Cliente idCliente) {
    this.idCliente = idCliente;
  }

  public LatitudeLongitude getLocRetirada() {
    return locRetirada;
  }

  public void setLocRetirada(LatitudeLongitude locRetirada) {
    this.locRetirada = locRetirada;
  }

  public LatitudeLongitude getLocEntrega() {
    return locEntrega;
  }

  public void setLocEntrega(LatitudeLongitude locEntrega) {
    this.locEntrega = locEntrega;
  }

  LatitudeLongitude locRetirada;
  LatitudeLongitude locEntrega;

}
