/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Repository;

import com.drone.ProjetoDrone.Classes.Produto.Produto;
import com.drone.ProjetoDrone.Services.ProdutoService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Josué
 */
public class ProdutoRepository implements ProdutoService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Produto> listar(int offset, int quantidade) {
                Query query = entityManager.createQuery(
                "SELECT DISTINCT p FROM produtos p");
        List<Produto> resultados = query.getResultList();
        return resultados;
    }

    @Override
    public Produto obter(long idProduto) {
                Query query = entityManager.createQuery(
                "SELECT DISTINCT p FROM produtos p "
                + "WHERE p.produto_id = :idProd");
        query.setParameter("idProd", idProduto);
        Produto resultado = (Produto) query.getSingleResult();
        return resultado;
    }

}
