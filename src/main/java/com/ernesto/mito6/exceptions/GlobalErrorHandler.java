package com.ernesto.mito6.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleModelNotFound(ModelNotFoundException ex, WebRequest req){
        ErrorResponse response = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), req.getDescription(false));//En produccion nunca dejar ex.getMessage, si no un mensaje generico
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoDeleteModelException.class)
    public ResponseEntity<ErrorResponse> handleNotDeletedModel(NoDeleteModelException ex, WebRequest req){
        ErrorResponse response = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), req.getDescription(false));//En produccion nunca dejar ex.getMessage, si no un mensaje generico
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
