/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Services;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Josué
 */
public interface ClienteService extends Serializable {

    public List<Cliente> listar(int offset, int quantidade);

    public Cliente obter(long idCliente);

    public void incluir(Cliente c);
    
    public Cliente logar (String email, String senha);

}
