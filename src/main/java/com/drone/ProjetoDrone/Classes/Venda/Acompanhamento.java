/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Venda;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rafael Rodrigues
 */
public class Acompanhamento implements Serializable{
    private String nome;
    private String codigoCompra;
    private Date dataVenda;
    private int qtd;
    private String formaPagameto;
    private String statusPedido;

    public Acompanhamento(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getFormaPagameto() {
        return formaPagameto;
    }

    public void setFormaPagameto(String formaPagameto) {
        this.formaPagameto = formaPagameto;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
    
  
    
    
    
}
