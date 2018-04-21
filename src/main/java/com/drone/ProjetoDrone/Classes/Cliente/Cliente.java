/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Cliente;

import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafael Rodrigues
 */
public class Cliente {

    private int idCli;
    
    //numero
    @NotNull
    @Digits(integer = 5, fraction = 0)
    private int numero;
    //nome
    @NotNull
    @Size(min = 1, max = 45)
    private String nome;
    //sobrenome
    @NotNull
    @Size(min = 1, max = 45)
    private String sobrenome;
    //email
    @NotNull
    @Size(min = 1, max = 45)
    private String email;
    //CPF
    @NotNull
    @Size(min = 11, max = 11)
    private String cpf;
    //celular
    @NotNull
    @Size(min = 9, max = 11)
    private String celular;
    //sexo
    @NotNull
    @Size(min = 1, max =1)
    private String sexo;
    //estado
    @NotNull
    @Size(min = 1, max = 45)
    private String estado;
    //cidade
    @NotNull
    @Size(min = 1, max = 45)
    private String cidade;
    //rua
    @NotNull
    @Size(min = 1, max = 45)
    private String rua;
    //cep
    @NotNull
    @Size(min = 8, max = 8)
    private String cep;
    //Senha
    @NotNull
    @Size(min = 1, max = 45)
    private String senha;
    //Data de nascimento
    @NotNull
    @Future
    private Date dataNascimento;

    //----------------Construtores-------------------
    
    public Cliente() {
    }

    public Cliente(int numero, String nome, String sobrenome, String email, String cpf, String celular, String sexo, String estado, String cidade, String rua, String cep, String senha, Date dataNascimento) {
        this.numero = numero;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
        this.celular = celular;
        this.sexo = sexo;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.cep = cep;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }

    //--------------------fim construtores---------------------
    
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
