/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Funcionario;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Classes.Cliente.ClienteException;
import java.util.Calendar;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorFuncionario {
    public static void validar(Funcionario func) throws FuncionarioException {
        Calendar calendar = Calendar.getInstance();

        if (func == null) {
            throw new FuncionarioException("Funcionário inválido!");
        }
        //nome
        if (func.getNome().trim().equals("") || func.getNome() == null) {
            throw new FuncionarioException("Favor informar o nome.");
        }

        if (func.getNome().length() > 45) {
            throw new FuncionarioException("Nome inválido! O limite de caracteres foi ultrapassado.");
        }
        //sobrenome
        if (func.getSobrenome().trim().equals("") || func.getSobrenome() == null) {
            throw new FuncionarioException("Favor informar o sobrenome.");
        }

        if (func.getSobrenome().length() > 45) {
            throw new FuncionarioException("Sobrenome inválido! O limite de caracteres foi ultrapassado.");
        }
        //Login
        if (func.getLogin().trim().equals("") || func.getLogin() == null) {
            throw new FuncionarioException("Favor informar um login válido.");
        }

        if (func.getLogin().length() > 45) {
            throw new FuncionarioException("Login inválido!");
        }
        //Senha
        if (func.getSenha().trim().equals("") || func.getSenha() == null) {
            throw new FuncionarioException("Favor informar uma senha válida.");
        }

        if (func.getSenha().length() > 45) {
            throw new FuncionarioException("Senha inválido!");
        }
        //CPf
        if (func.getCpf().trim().equals("") || func.getCpf() == null) {
            throw new FuncionarioException("Favor informar o CPF.");
        }

        if (func.getCpf().length() > 11 || func.getCpf().length() < 11) {
            throw new FuncionarioException("CPF inválido!");
        }
       
    }
}
