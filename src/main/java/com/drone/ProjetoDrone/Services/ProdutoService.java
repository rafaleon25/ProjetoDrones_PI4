/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Services;

import com.drone.ProjetoDrone.Classes.Produto.Produto;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Josué
 */
public interface ProdutoService extends Serializable {

    public List<Produto> listar();

    public Produto obter(long idProduto);

}
