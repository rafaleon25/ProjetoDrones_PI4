/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Venda;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
public class Venda {
    private int idVenda;
    private int idCli;
    
    //parcelas
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private int parcelas;
    //forma de pagamento
    @NotNull
    private String formaPagamento;
    //numero do cartão
    @NotNull
    @Size(min = 16, max = 16)
    private String numeroCartao;
    //total venda
    private double totalVenda;

    public Venda() {
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
}
