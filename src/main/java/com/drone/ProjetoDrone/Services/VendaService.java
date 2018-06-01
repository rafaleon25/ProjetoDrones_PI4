/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Services;

import com.drone.ProjetoDrone.Classes.Venda.Venda;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Josué
 */
public interface VendaService extends Serializable {

//    public List<Venda> listar(int offset, int quantidade);
//
//    public Venda obter(long idVenda);

    public String incluir(Venda v);
    
    public List<Venda> listarVendas(long idCliente);

//    public void alterar(Venda v);
//
//    public void remover(long idVenda);
}
