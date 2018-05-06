/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Produto.Produto;
import com.drone.ProjetoDrone.Repository.ProdutoRepository;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Rafael Rodrigues
 */
@RequestMapping("/carrinho")
@Controller
@Scope("session")
public class CarrinhoController {

    @Autowired
    private ProdutoRepository repository;
    
    
    private List<Produto> carrinho = new ArrayList<Produto>();

  @PostMapping("/{id}")
  public ModelAndView adicionarItem(@PathVariable("id") Long idProduto,
            RedirectAttributes redirectAttributes, HttpSession sessao) {
    
    Produto p = repository.obter(idProduto);
    carrinho.add(p);

     redirectAttributes.addFlashAttribute("carrinho", p);
    return new ModelAndView("Cart");
  }

  public List<Produto> getCarrinho() {
    return carrinho;
  }
  
  @GetMapping("/Cart")
  public ModelAndView visualizar() {
    return new ModelAndView("Cart");
  }
}

