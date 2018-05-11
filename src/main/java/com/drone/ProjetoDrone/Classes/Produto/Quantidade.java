/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

import javax.persistence.Transient;

/**
 *
 * @author Rafael Rodrigues
 */
public class Quantidade {

    @Transient
    private long quantidade;
    @Transient
    private long id;

    public Quantidade() {
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
