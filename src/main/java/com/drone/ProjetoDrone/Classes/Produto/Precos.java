/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

import java.util.Date;

/**
 *
 * @author Rafael Rodrigues
 */
public class Precos {
    private int IdPreco, criadoPor, AlteradoPor;
    private Date dataAlteracao;
    private double preco;

    public Precos() {
    }

    public int getIdPrrco() {
        return IdPreco;
    }

    public void setIdPrrco(int IdPrrco) {
        this.IdPreco = IdPrrco;
    }

    public int getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(int criadoPor) {
        this.criadoPor = criadoPor;
    }

    public int getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(int AlteradoPor) {
        this.AlteradoPor = AlteradoPor;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
