package com.professorangoti.querycreation.service;

import java.util.List;

import com.professorangoti.querycreation.model.Venda;
import com.professorangoti.querycreation.repository.VendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    VendaRepository repository;

    public List<Venda> letraA() {
        return repository.findByDescontoNull();
    }
    public List<Venda> letraB() {
        return repository.findByDescontoNotNull();
    }
    public List<Venda> letraC() {
        return repository.findByOrderByValorUnitario();
    }
    public Venda letraD() {
        return repository.findTopByOrderByQuantidadeDesc();
    }
    public List<Venda> letraE() {
        return repository.findByQuantidadeGreaterThanEqual(10);
    }
    public List<Integer> letraF() {
        return repository.findByNotaFiscalAcimaDe500();
    }

}
