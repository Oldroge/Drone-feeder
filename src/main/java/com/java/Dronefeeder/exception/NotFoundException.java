package com.java.Dronefeeder.exception;

@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException {
  private static String message = "O dado não foi encontrado.";

  public NotFoundException() {
    super(message);
  }
}