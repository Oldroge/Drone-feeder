package com.java.Dronefeeder.exception;

@SuppressWarnings("serial")
public class EntregaNaoEncontrada extends RuntimeException {
  private static String message = "Entrega não encontrada.";

  public EntregaNaoEncontrada() {
    super(message);
  }
}