/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Venda;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
@Entity
@Table(name = "Vendas")
public class Venda implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "venda_id", nullable = false)
    private VendaProd vendaProd;

    @Id
    @Column(name = "vendaID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenda;

    private int idCli;

    //parcelas
    @NotNull
    @Digits(integer = 2, fraction = 0)
    @Column(name = "parcelas", precision = 2, scale = 0, nullable = false)
    private int parcelas;
    //forma de pagamento
    @NotNull
    @Size(min = 2, max = 2)
    @Column(name = "formaPagamento", length = 2, nullable = false, unique = false)
    private String formaPagamento;
    //numero do cartão
    @NotNull
    @Size(min = 16, max = 16)
    @Column(name = "numeroCartao", length = 16, nullable = false, unique = false)
    private String numeroCartao;

    //total venda
    @Column(name = "totalVenda", precision = 6, scale = 2, nullable = false)
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
