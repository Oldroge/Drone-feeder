package com.java.Dronefeeder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long pedido_id;

  @JsonIgnore
  @ManyToOne
  private Cliente cliente;


  @ManyToOne
  @JoinColumn(name = "retirada_entrega_id")
  private RetiradaEntrega retiradaEntrega;

  public Long getPedido_id() {
    return pedido_id;
  }

  public void setPedido_id(Long pedido_id) {
    this.pedido_id = pedido_id;
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
