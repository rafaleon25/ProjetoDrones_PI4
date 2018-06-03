/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Repository;

import com.drone.ProjetoDrone.Services.ResetSenha;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Josué
 */
@Repository
public class ResetSenhaRepository implements ResetSenha {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void atualizarSenha(int idCli, String senha) {
        Query query = entityManager.createNativeQuery("update clientes set senha = ?1 where cliente_id = ?2");
        query.setParameter(1, senha);
        query.setParameter(2, idCli);
        query.executeUpdate();
    }
}
