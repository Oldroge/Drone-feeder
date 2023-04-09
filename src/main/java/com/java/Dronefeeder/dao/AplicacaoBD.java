package com.java.Dronefeeder.dao;

/**
 * Classe AplicacaoBd.
 **/
public class AplicacaoBD {

  /**
   * Atributos.
   **/
    
  private ClienteDao clienteDao;
  private DronesDao dronesDao;
  private LatitudeLongitudeDao latitudeLongitudeDao;
  private PedidoDao pedidoDao;
  private RetiradaEntregaDao retiradaEntregaDao;
  private VideoDao videoDao;

  /**
   * Métodos.
   **/
  
  public AplicacaoBD() {
    this.clienteDao = new ClienteDao();
    this.dronesDao = new DronesDao();
    this.latitudeLongitudeDao = new LatitudeLongitudeDao();
    this.pedidoDao = new PedidoDao();
    this.retiradaEntregaDao = new RetiradaEntregaDao();
    this.videoDao = new VideoDao();
  }
  
  public ClienteDao clienteDao() {
    return clienteDao;
  }
  
  public DronesDao dronesDao() {
    return dronesDao;
  }
  
  public LatitudeLongitudeDao latitudeLongitudeDao() {
    return latitudeLongitudeDao;
  }

  public PedidoDao pedidoDao() {
    return pedidoDao;
  }
  
  public RetiradaEntregaDao retiradaEntregaDao() {
    return retiradaEntregaDao;
  }

  public VideoDao videoDao() {
    return videoDao;
  }
}
