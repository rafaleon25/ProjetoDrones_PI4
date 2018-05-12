/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Classes.Produto.Produto;
import com.drone.ProjetoDrone.Classes.Venda.Venda;
import com.drone.ProjetoDrone.Classes.Venda.VendaProd;
import com.drone.ProjetoDrone.Repository.VendaRepository;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafael Rodrigues
 */
@Controller
@RequestMapping("/venda")
public class VendaController {
    
    @Autowired
    private VendaRepository repository;
    
    @GetMapping
    public ModelAndView telaVenda(HttpSession sessao){
        Venda venda = new Venda();
        Cliente cli = (Cliente) sessao.getAttribute("usuario");
        venda.setCliente(cli);
        
        List<Produto> carrinho = (List<Produto>) sessao.getAttribute("carrinho");
        
        Set<VendaProd> vendaProd = new LinkedHashSet<>();
        for (int i = 0; i < carrinho.size(); i++) {
            VendaProd vendaprodCar = new VendaProd();
            vendaprodCar.setProduto(carrinho.get(i));
            vendaprodCar.setQtd(carrinho.get(i).getQuantidadeUsu());
            vendaProd.add(vendaprodCar);
        }
        venda.setVendaProd(vendaProd);
        
        double total = 0;
        
        for (int i = 0; i < carrinho.size(); i++) {
            total = total + (carrinho.get(i).getPrecos().getPreco() * carrinho.get(i).getQuantidadeUsu());
        }
        venda.setTotalVenda(total);
        return new ModelAndView("FinalizarCompra").addObject("venda", venda);
    }
    
    @PostMapping("/finalizar")
    public ModelAndView finalizar(HttpSession sessao, @ModelAttribute("venda") Venda venda){
        
        repository.incluir(venda);
        
        return new ModelAndView("Resumo");
    }
}
