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
public class ValidadorPreco {
    public static void Validar (Precos preco) throws PrecosException{
        
        if(preco == null){
            throw new PrecosException("Preço inválido");
        }
        
        if(preco.getPreco() == 0){
            throw new PrecosException("informe um preço válido.");
        }
    }
}
