/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Venda;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Rafael Rodrigues
 */
public class VendaPag implements Serializable {
    
    @NotNull
    @Size(min = 16, max = 16)
    private String numeroCartao;
    @NotNull
    @Size(min = 1, max = 45)
    private String nomeTitular;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    private Date validadeCartao;
    @NotNull
    @Digits(integer = 3, fraction = 0)
    private long codigoSeguranca;
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private int parcelas;
    @NotNull
    @Size(min = 2, max = 2)
    private String formaPagamento;

    public VendaPag() {
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Date getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(Date validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public long getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(long codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    
}
