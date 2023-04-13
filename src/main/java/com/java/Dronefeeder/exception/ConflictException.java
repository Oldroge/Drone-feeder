package com.java.Dronefeeder.exception;

@SuppressWarnings("serial")
public class ConflictException extends RuntimeException {
  private static String message = "Entrega já encontrada.";

  public ConflictException() {
    super(message);
  }
}