/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Venda;

import com.drone.ProjetoDrone.Classes.Produto.Produto;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Rafael Rodrigues
 */
@Entity
@Table(name = "VendaProd")
public class VendaProd implements Serializable {

    @OneToMany(mappedBy = "vendaProd")
    private Set<Venda> venda;

    @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @Id
    @Column(name = "venda_id")
    private int vendaId;

    @NotNull
    @Digits(integer = 3, fraction = 0)
    private int qtd;

    @Id
    @Column(name = "produtoID")
    private int produtoId;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_venda")
    private Date dataVenda = new Date();

    public VendaProd() {
    }

    public VendaProd(int qtd) {
        this.qtd = qtd;
    }

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

}
