/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Produto.Produto;
import com.drone.ProjetoDrone.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Rafael Rodrigues
 */
@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutoRepository repository;
    
    @GetMapping("/telaProdutos")
    public ModelAndView listarProd() {
        List<Produto> produtos = repository.listar();
        return new ModelAndView("Produtos").addObject("produtos", produtos);
    }
    
    @GetMapping("/{id}")
    public ModelAndView detalheProd(@PathVariable("id") Integer id){
        Produto produto = repository.obter(id);
        return new ModelAndView("Produtos").addObject("produto", produto);
    }
    
    
//    @GetMapping("/{id}")
//  public ModelAndView detalhe(@PathVariable("id") long id) {
//    Produto produto = servico.obter(id);
//    return new ModelAndView("produto/detalhe").addObject("produto", produto);
//  }
}
