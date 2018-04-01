/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

/**
 *
 * @author Rafael Rodrigues
 */
public class Produto {
    
    private int idProd, precoId, velocidadeMax, bateriaDuracao, camera;
    private String nome, descricao, fabricante;
    private double peso;

    public Produto() {
    }

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
     
}
