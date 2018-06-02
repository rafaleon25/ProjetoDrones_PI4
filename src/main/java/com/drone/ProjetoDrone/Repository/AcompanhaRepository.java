/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Repository;

import com.drone.ProjetoDrone.Classes.Venda.Venda;
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
    public List<Venda> listarVendas(long idCliente) {
        Query query = entityManager.createQuery(
                "SELECT DISTINCT v FROM Venda v "
                        + "WHERE v.cliente.idCli = :idCliente");
        query.setParameter("idCliente", idCliente);
        List<Venda> resultados = query.getResultList();
        return resultados;
    }       
}
