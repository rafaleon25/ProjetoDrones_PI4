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
import java.util.Set;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public ModelAndView listarProd(HttpSession sessao) {
        List<Produto> produtos = repository.listar();
        sessao.setAttribute("prods", produtos);
        return new ModelAndView("Produtos");
    }

//    @GetMapping("/{id}")
//    public ModelAndView detalheProd(@PathVariable("id") Integer id){
//        Produto produto = repository.obter(id);
//        return new ModelAndView("DescProd").addObject("produto", produto);
//    }
    @GetMapping("/{id}")
    public ModelAndView detalhe(@PathVariable("id") long id) {
        Produto produto = repository.obter(id);
        return new ModelAndView("DescProd").addObject("produto", produto);
    }

    

//      @PostMapping("/{id}")
//  public ModelAndView adicionarItem(@PathVariable("id") Long idProduto,
//          RedirectAttributes redirectAttributes) {
//
//    Produto p = servico.obter(idProduto);
//    produtosAdicionados.add(p);
//
//    redirectAttributes.addFlashAttribute("produto", p);
//    return new ModelAndView("redirect:/carrinho");
//  }
}
