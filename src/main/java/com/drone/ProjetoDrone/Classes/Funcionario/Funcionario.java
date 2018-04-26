/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Funcionario;

import com.drone.ProjetoDrone.Classes.Produto.Precos;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
@Entity
@Table(name = "Funcionario")
public class Funcionario implements Serializable {

    //@OneToMany(fetch = FetchType.LAZY)
    //@JoinColumn(name = "criado_por", nullable = false)
    @Transient
    private Precos precos;
    
    @OneToMany(mappedBy = "funcCriacao")
    private Set<Precos> precosCriados;
    
    @OneToMany(mappedBy = "funcAlteracao")
    private Set<Precos> precosAlterados;

    @Id
    @Column(name = "funcionario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Set<Precos> getPrecosCriados() {
        return precosCriados;
    }

    public void setPrecosCriados(Set<Precos> precosCriados) {
        this.precosCriados = precosCriados;
    }

    public Set<Precos> getPrecosAlterados() {
        return precosAlterados;
    }

    public void setPrecosAlterados(Set<Precos> precosAlterados) {
        this.precosAlterados = precosAlterados;
    }
}
