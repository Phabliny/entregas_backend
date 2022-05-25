package com.professorangoti.querycreation.controller;

import java.util.List;

import com.professorangoti.querycreation.model.Venda;
import com.professorangoti.querycreation.service.VendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venda")
public class VendaController {

    @Autowired
    VendaService service;

    @GetMapping("a")
    ResponseEntity<List<Venda>> letraA() {
        return ResponseEntity.status(HttpStatus.OK).body(service.letraA());
    }

    @GetMapping("b")
    ResponseEntity<List<Venda>> letraB() {
        return ResponseEntity.status(HttpStatus.OK).body(service.letraB());
    }

    @GetMapping("c")
    ResponseEntity<List<Venda>> letraC() {
        return ResponseEntity.status(HttpStatus.OK).body(service.letraC());
    }

    @GetMapping("d")
    ResponseEntity<Venda> letraD() {
        return ResponseEntity.status(HttpStatus.OK).body(service.letraD());
    }

    @GetMapping("e")
    ResponseEntity<List<Venda>> letraE() {
        return ResponseEntity.status(HttpStatus.OK).body(service.letraE());
    }

    @GetMapping("f")
    ResponseEntity<List<Integer>> letraF() {
        return ResponseEntity.status(HttpStatus.OK).body(service.letraF());
    }
}
