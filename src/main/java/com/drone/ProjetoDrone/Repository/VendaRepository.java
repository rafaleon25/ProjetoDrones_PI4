/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Repository;

import com.drone.ProjetoDrone.Classes.Venda.CodigoCompra;
import com.drone.ProjetoDrone.Classes.Venda.Venda;
import com.drone.ProjetoDrone.Classes.Venda.VendaProd;
import com.drone.ProjetoDrone.Services.VendaService;
import java.util.Iterator;
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
    public String incluir(Venda v) {
        String codigoCompra = "";
        boolean sucesso = true;
        entityManager.persist(v);
//        entityManager.flush();
//        Integer id = v.getIdVenda();

//        Iterator it = v.getVendaProd().iterator();
//        
//        while(it.hasNext()) {
//            VendaProd vp = (VendaProd) it.next();
//             vp.setVenda(v);
//            entityManager.persist(vp);
//        }
//        for (int i = 0; i < v.getVendaProd().size(); i++) {
//            VendaProd vp = v.getVendaProd().iterator().next();
//            vp.setVenda(v);
//            entityManager.persist(vp);
//        }
        
        for (VendaProd vp : v.getVendaProd()) {
            sucesso = false;
            vp.setVenda(v);
            entityManager.persist(vp);
            sucesso = true;
        }
        if(sucesso == true){
            codigoCompra = CodigoCompra.randomString(10);
        }
        return codigoCompra;
    }
}
