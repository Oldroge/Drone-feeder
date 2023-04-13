package com.java.Dronefeeder.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long clientes_id;

  @Column
  private String nome;

  @Column
  @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
  private List<Pedido> pedidos = new ArrayList<Pedido>();

  public Long getClientes_id() {
    return clientes_id;
  }

  public void setClientes_id(Long clientes_id) {
    this.clientes_id = clientes_id;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos(ArrayList<Pedido> pedidos) {
    this.pedidos = pedidos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void adicionarPedido(Pedido pedido) {
    this.pedidos.add(pedido);
  }

}
