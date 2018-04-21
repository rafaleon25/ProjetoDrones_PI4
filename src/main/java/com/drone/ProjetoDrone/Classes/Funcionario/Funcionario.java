/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Funcionario;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
public class Funcionario {

    private int idFunc;
    //nome
    @NotNull
    @Size(min = 1, max = 45)
    private String nome;
    //sobrenome
    @NotNull
    @Size(min = 1, max = 45)
    private String sobrenome;
    //login
    @NotNull
    @Size(min = 1, max = 45)
    private String login;
    //senha
    @NotNull
    @Size(min = 1, max = 45)
    private String senha;
    //cpf
    @NotNull
    @Size(min = 11, max = 11)
    private String cpf;

    //--------------------------Construtores---------------------
    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String login, String senha, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
    }

    //----------------------- Fim dos Construtores---------------------
    
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
