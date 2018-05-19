/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Rodrigues
 */
public class QuantidadeProdutos {
    private List<Quantidade> quantidade = new ArrayList<>();

    public QuantidadeProdutos() {
    }
    
    
    

    public List<Quantidade> getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(List<Quantidade> quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
