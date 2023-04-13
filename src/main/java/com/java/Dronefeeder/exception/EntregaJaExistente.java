package com.java.Dronefeeder.exception;

@SuppressWarnings("serial")
public class EntregaJaExistente extends RuntimeException {
  private static String message = "Entrega já  encontrada.";

  public EntregaJaExistente() {
    super(message);
  }
}