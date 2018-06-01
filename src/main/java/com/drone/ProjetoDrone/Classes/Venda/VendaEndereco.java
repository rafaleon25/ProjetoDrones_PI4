/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Venda;

import java.io.Serializable;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
public class VendaEndereco implements Serializable {
    
    @NotNull
    @Size(min = 1, max = 45)
    private String rua;
    @NotNull
    @Digits(integer = 5, fraction = 0)
    private int numero;
    @NotNull
    @Size(min = 8, max = 8)
    private String cep;
    @NotNull
    @Size(min = 1, max = 45)
    private String cidade;
    @NotNull
    @Size(min = 1, max = 45)
    private String estado;
     @NotNull
    @Size(min = 1, max = 45)
    private String nome;
     @NotNull
    @Size(min = 9, max = 11)
    private String celular;

    public VendaEndereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
     
     
}
