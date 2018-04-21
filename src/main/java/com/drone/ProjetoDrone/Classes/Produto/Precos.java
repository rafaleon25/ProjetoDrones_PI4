/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

import java.util.Date;
import javax.validation.constraints.Digits;

/**
 *
 * @author Rafael Rodrigues
 */
public class Precos {
    private int IdPreco; 
    private int criadoPor;
    private int AlteradoPor;
    private Date dataAlteracao;
    
    @Digits(integer = 6, fraction = 2)
    private double preco;

    
    //-------------------------Construtor-----------------------
    public Precos() {
    }

    public Precos(double preco) {
        this.preco = preco;
    }

    
    //------------------------Fim dos construtores---------------
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
