package com.professorangoti.querycreation.repository;

import java.util.List;

import com.professorangoti.querycreation.model.Venda;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Integer> {

    // a) Retorna todos os itens que foram vendidos sem desconto.
    public List<Venda> findByDescontoNull();
    
    // b) Retorna todos os itens que foram vendidos com desconto.
    public List<Venda> findByDescontoNotNull();
    
    // c) Retorna todos os itens e ordene o resultado do maior valor para o menor.
    public List<Venda> findByOrderByValorUnitario();

    // d) Retorna o produto que mais vendeu.
    public Venda findTopByOrderByQuantidadeDesc();
    
    // e) Consulte as NF que foram vendidas mais de 10 unidades de pelo menos um produto.
    public List<Venda> findByQuantidadeGreaterThanEqual(Integer quant);
    
    // f) Pesquise o valor total das NF, onde esse valor seja maior que 500, e ordene o resultado do maior valor para o menor.
    @Query("select v.idNotaFiscal from Venda v group by idNotaFiscal having sum(quantidade*valorUnitario) > 500 order by sum(quantidade*valorUnitario)")
    public List<Integer> findByNotaFiscalAcimaDe500();
}
