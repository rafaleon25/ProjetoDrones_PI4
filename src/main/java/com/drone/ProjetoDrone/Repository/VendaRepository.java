/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Repository;

import com.drone.ProjetoDrone.Classes.Venda.Venda;
import com.drone.ProjetoDrone.Classes.Venda.VendaProd;
import com.drone.ProjetoDrone.Services.VendaService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Josué
 */
@Repository
public class VendaRepository implements VendaService {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void incluir(Venda v) {   
            if (v.getIdVenda() == null) {
                entityManager.persist(v);
            } else {
                entityManager.merge(v);
            }
        entityManager.persist(v);
    }
}
