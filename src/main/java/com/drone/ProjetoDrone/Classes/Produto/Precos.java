/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 *
 * @author Rafael Rodrigues
 */
@Entity
@Table(name = "Precos")
public class Precos implements Serializable {

    @Id
    @Column(name = "preco_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdPreco;
    
    private int criadoPor;
    private int AlteradoPor;
    private Date dataAlteracao;

    @Digits(integer = 6, fraction = 2)
    @Column(name = "preco", precision = 6, scale = 2, nullable = false)
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
