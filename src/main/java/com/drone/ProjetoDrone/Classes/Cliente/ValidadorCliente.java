/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Cliente;

import java.util.Calendar;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorCliente {

    public static void validar(Cliente cli) throws ClienteException {
        Calendar calendar = Calendar.getInstance();

        if (cli == null) {
            throw new ClienteException("Cliente inválido!");
        }
        //nome
        if (cli.getNome().trim().equals("") || cli.getNome() == null) {
            throw new ClienteException("Favor informar o nome.");
        }

        if (cli.getNome().length() > 45) {
            throw new ClienteException("Nome inválido! O limite de caracteres foi ultrapassado.");
        }
        //sobrenome
        if (cli.getSobrenome().trim().equals("") || cli.getSobrenome() == null) {
            throw new ClienteException("Favor informar o sobrenome.");
        }

        if (cli.getSobrenome().length() > 45) {
            throw new ClienteException("Sobrenome inválido! O limite de caracteres foi ultrapassado.");
        }
        //email
        if (cli.getEmail().trim().equals("") || cli.getEmail() == null) {
            throw new ClienteException("Favor informar o E-mail.");
        }

        if (!cli.getEmail().contains("@")) {
            throw new ClienteException("E-mail inválido!");
        }

        if (cli.getEmail().length() > 45) {
            throw new ClienteException("E-mail inválido! O limite de caracteres foi ultrapassado.");
        }
        //CPF
        if (cli.getCpf().trim().equals("") || cli.getCpf() == null) {
            throw new ClienteException("Favor informar o CPF.");
        }

        if (cli.getCpf().length() > 11 || cli.getCpf().length() < 11) {
            throw new ClienteException("CPF inválido!");
        }
        //Celular
        if (cli.getCelular().trim().equals("") || cli.getCelular() == null) {
            throw new ClienteException("Favor informar um número de celular.");
        }

        if (cli.getCpf().length() > 9 || cli.getCpf().length() < 9) {
            throw new ClienteException("Celular inválido!");
        }
        //Data de Nascimento
        if (cli.getDataNascimento().after(calendar.getTime())) {
            throw new ClienteException("Data de nascimento inválida");
        }
        //Sexo
        if (cli.getSexo().trim().equals("") || cli.getSexo() == null) {
            throw new ClienteException("Favor informar um valor no campo sexo.");
        }
        //Estado
        if (cli.getEstado().trim().equals("") || cli.getEstado() == null) {
            throw new ClienteException("Favor informar um estado.");
        }

        if (cli.getEstado().length() > 45) {
            throw new ClienteException("Estado inválido!");
        }
        //Cidade
        if (cli.getCidade().trim().equals("") || cli.getCidade() == null) {
            throw new ClienteException("Favor informar uma cidade.");
        }

        if (cli.getCidade().length() > 45) {
            throw new ClienteException("Cidade inválido!");
        }
        //Rua
        if (cli.getRua().trim().equals("") || cli.getRua() == null) {
            throw new ClienteException("Favor informar uma rua.");
        }

        if (cli.getRua().length() > 45) {
            throw new ClienteException("Rua inválida!");
        }
        //CEP
        if (cli.getCep().trim().equals("") || cli.getCep() == null) {
            throw new ClienteException("Favor informar um CEP.");
        }

        if (cli.getCep().length() > 45) {
            throw new ClienteException("CEP inválido!");
        }
        //Numero
        if (cli.getNumero() < 0) {
            throw new ClienteException("Favor informar um Número válido.");
        }
        //Senha
        if (cli.getSenha().trim().equals("") || cli.getSenha() == null) {
            throw new ClienteException("Favor informar uma senha válida.");
        }

        if (cli.getSenha().length() > 45) {
            throw new ClienteException("Senha inválida!");
        }
    }
}
