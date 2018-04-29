/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Repository;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Services.ClienteService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Josué
 */

public class ClienteRepository implements ClienteService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cliente> listar(int offset, int quantidade) {
        Query query = entityManager.createQuery(
                "SELECT DISTINCT c FROM clientes c");
        List<Cliente> resultados = query.getResultList();
        return resultados;
    }

    @Override
    public Cliente obter(long idCliente) {
        Query query = entityManager.createQuery(
                "SELECT DISTINCT c FROM clientes c "
                + "WHERE c.cliente_id = :idCli");
        query.setParameter("idCli", idCliente);
        Cliente resultado = (Cliente) query.getSingleResult();
        return resultado;
    }

    @Override
    @Transactional
    public void incluir(Cliente c) {
        if (c.getIdCli() == null) {
            entityManager.persist(c);
        } else {
            entityManager.merge(c);
        }
        entityManager.persist(c);
    }

//    @Override
//    @Transactional
//    public void alterar(Cliente c) {
//        if (c.getIdCli() == null) {
//            entityManager.persist(c);
//        } else {
//            entityManager.merge(c);
//        }
//        entityManager.persist(c);
//    }
//
//    @Override
//    @Transactional
//    public void remover(long idCliente) {
//        Cliente c = entityManager.find(Cliente.class, idCliente);
//        entityManager.remove(c);
//    }
}
