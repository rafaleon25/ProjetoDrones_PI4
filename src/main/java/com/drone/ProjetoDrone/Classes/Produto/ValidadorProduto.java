/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Produto;

import java.util.Calendar;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorProduto {

    public static void validar(Produto prod) throws ProdutoException {

        if (prod == null) {
            throw new ProdutoException("Produto inválido!");
        }
        
        if(prod.getNome().trim().equals("") || prod.getNome() == null){
            throw new ProdutoException("Digite o nome do produto.");
        }
        
        if(prod.getNome().length() > 45){
            throw new ProdutoException("Nome do produto inválido! O limite de caracteres foi ultrapassado.");
        }
        
        if(prod.getDescricao().trim().equals("") || prod.getDescricao() == null){
            throw new ProdutoException("Dê uma descrição para o produto.");
        }
        
        if(prod.getDescricao().length() > 200){
            throw new ProdutoException("Descrição inválida! O limite de caracteres foi ultrapassado.");
        }
        
        if(prod.getPeso() == null|| prod.getPeso() == 0){
            throw new ProdutoException("Informe um peso para o produto.");
        }
        
        if(prod.getVelocidadeMax() == 0){
           throw new ProdutoException("Informe um valor para a velocidade maxima para o produto.");
        }
        
        if(prod.getBateriaDuracao() == 0){
            throw new ProdutoException("informe a duração da bateria.");
        }
        
        if(prod.getFabricante().trim().equals("") || prod.getFabricante() == null){
            throw new ProdutoException("informe o fabricante do produto.");
        }
        
        if(prod.getFabricante().length() > 45){
            throw new ProdutoException("Nome do fabricante inválido! O limite de caracteres foi ultrapassado.");
        }
    }
}
