package com.java.Dronefeeder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "idCliente")
  private Cliente cliente;

  @ManyToOne
  @JoinColumn(name = "idRetiradaEntrega")
  private RetiradaEntrega retiradaEntrega;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cliente getIdCliente() {
    return cliente;
  }

  public void setIdCliente(Cliente idCliente) {
    this.cliente = idCliente;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public RetiradaEntrega getRetiradaEntrega() {
    return retiradaEntrega;
  }

  public void setRetiradaEntrega(RetiradaEntrega retiradaEntrega) {
    this.retiradaEntrega = retiradaEntrega;
  }


}
