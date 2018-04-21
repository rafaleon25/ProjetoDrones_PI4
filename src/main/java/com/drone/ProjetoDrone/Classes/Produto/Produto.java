/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
public class Produto {
    
    private int idProd;
    private int precoId;
    //velicidade maxima 
    @NotNull
    @Digits(integer = 3, fraction = 0)
    private int velocidadeMax;
    //duração da bateria
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private int bateriaDuracao;
    //camera
    @NotNull
    @Digits(integer =1, fraction = 0)
    private int camera;
    //nome 
    @NotNull
    @Size(min = 1, max = 45)
    private String nome;
    //descrição
    @NotNull
    @Size(min = 1, max = 100)
    private String descricao;
    //fabricante 
    @NotNull
    @Size(min = 1, max = 45)
    private String fabricante;
    //peso
    @NotNull
    @Digits(integer = 3, fraction = 2)
    private double peso;

    
    //-------------------------Construtores--------------------
    public Produto() {
    }

    public Produto(int velocidadeMax, int bateriaDuracao, int camera, String nome, String descricao, String fabricante, double peso) {
        this.velocidadeMax = velocidadeMax;
        this.bateriaDuracao = bateriaDuracao;
        this.camera = camera;
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.peso = peso;
    }

    
    //--------------------Fim dos construtores------------------
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getPrecoId() {
        return precoId;
    }

    public void setPrecoId(int precoId) {
        this.precoId = precoId;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public int getBateriaDuracao() {
        return bateriaDuracao;
    }

    public void setBateriaDuracao(int bateriaDuracao) {
        this.bateriaDuracao = bateriaDuracao;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    
     
}
