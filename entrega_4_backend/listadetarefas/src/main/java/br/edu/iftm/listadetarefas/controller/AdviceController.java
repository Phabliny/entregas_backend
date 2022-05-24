package br.edu.iftm.listadetarefas.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {

    @ExceptionHandler
    ResponseEntity<String> idNotExists(EmptyResultDataAccessException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse Id não existe!");
    }

    @ExceptionHandler
    ResponseEntity<String> WrongType(HttpMediaTypeNotSupportedException ex){
        return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("Formato inexistente!");
    }
}
