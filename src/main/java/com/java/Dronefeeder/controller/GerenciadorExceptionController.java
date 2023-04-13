package com.java.Dronefeeder.controller;

import com.java.Dronefeeder.exception.DataError;
import com.java.Dronefeeder.exception.ConflictException;
import com.java.Dronefeeder.exception.NotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**Classe controller advice. */
@ControllerAdvice
public class GerenciadorExceptionController {

  @ExceptionHandler(ConflictException.class)
  public ResponseEntity<DataError> internalServerError(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new DataError(exception.getMessage()));
  }

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<DataError> notFound(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(new DataError(exception.getMessage()));
  }
}