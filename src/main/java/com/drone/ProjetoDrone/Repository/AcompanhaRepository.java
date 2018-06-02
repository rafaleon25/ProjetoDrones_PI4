/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Repository;

import com.drone.ProjetoDrone.Classes.Venda.Acompanhamento;
import com.drone.ProjetoDrone.Services.AcompanhaPedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Josué
 */
@Repository
public class AcompanhaRepository implements AcompanhaPedido {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<Acompanhamento> listarVendas(long idCliente) {
        Query query = entityManager.createNativeQuery(
                "select v.dt_venda dataVenda, v.codigo_compra codigoCompra, "
                        + "p.nome, vp.qtd, v.forma_pagamento formaPagto, v.status_pedido statusPedido "
                        + "from vendas v " +
                            "inner join venda_prod vp on vp.venda_id = v.vendaid " +
                            "inner join produtos p on p.produto_id = vp.produto_id " +
                            "where v.cliente_id = :idCliente" 
);
        query.setParameter("idCliente", idCliente);
        List<Acompanhamento> resultados = query.getResultList();
        return resultados;
    }       
}
