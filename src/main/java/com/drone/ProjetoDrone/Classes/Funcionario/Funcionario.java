/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Funcionario;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
@Entity
@Table(name = "Funcionario")
public class Funcionario implements Serializable {

    @Id
    @Column(name = "funcionario_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFunc;
    
    //nome
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome", length = 45, nullable = false, unique = false)
    private String nome;
    
    //sobrenome
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sobrenome", length = 45, nullable = false, unique = false)
    private String sobrenome;
    
    //login
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "login", length = 10, nullable = false, unique = false)
    private String login;
    
    //senha
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "senha", length = 10, nullable = false, unique = false)
    private String senha;
    
    //cpf
    @NotNull
    @Size(min = 11, max = 11)
    @Column(name = "cpf", length = 11, nullable = false, unique = false)
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
