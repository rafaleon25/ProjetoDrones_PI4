/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Classes.Produto.Produto;
import com.drone.ProjetoDrone.Classes.Produto.Quantidade;
import com.drone.ProjetoDrone.Classes.Produto.QuantidadeProdutos;
import com.drone.ProjetoDrone.Classes.Venda.Venda;
import com.drone.ProjetoDrone.Classes.Venda.VendaProd;
import com.drone.ProjetoDrone.Repository.VendaRepository;
import java.util.ArrayList;
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
    
    @PostMapping
    public ModelAndView telaVenda(@ModelAttribute(value = "prodQtd") QuantidadeProdutos prodQtd, HttpSession sessao){
        Venda venda = new Venda();
        Cliente cli = (Cliente) sessao.getAttribute("usuario");
        venda.setCliente(cli);
        
        List<Produto> carrinho = (List<Produto>) sessao.getAttribute("carrinho");
        QuantidadeProdutos quantidadesProd =  prodQtd;
        List<Quantidade> quantidades = prodQtd.getQuantidade();
        
        Set<VendaProd> vendaProd = new LinkedHashSet<>();
        for (int i = 0; i < carrinho.size(); i++) {
            VendaProd vendaprodCar = new VendaProd();
            
//            vendaprodCar.setQtd(carrinho.get(i).getQuantidadeUsu());
            for (int j = 0; j < quantidades.size(); j++) {
                if(carrinho.get(i).getIdProd() == quantidades.get(j).getId()){
                    vendaprodCar.setProduto(carrinho.get(i));
                    vendaprodCar.setQtd(quantidades.get(j).getQuantidade());
                    carrinho.get(i).setQuantidadeUsu((int) quantidades.get(j).getQuantidade());
                }
            }
            vendaProd.add(vendaprodCar);
        }
        venda.setVendaProd(vendaProd);
        
        double total = 0;
        
        for (int i = 0; i < carrinho.size(); i++) {
//            total = total + (carrinho.get(i).getPrecos().getPreco() * carrinho.get(i).getQuantidadeUsu());
            for (int j = 0; j < quantidades.size(); j++) {
                if(carrinho.get(i).getIdProd() == quantidades.get(j).getId()){
                    total = total + (carrinho.get(i).getPrecos().getIdPrrco() * quantidades.get(j).getQuantidade());
                }
            }
        }
        venda.setTotalVenda(total);
        sessao.setAttribute("venda", venda);
        return new ModelAndView("FinalizarCompra").addObject("venda", new Venda());
    }
    
    @PostMapping("/finalizar")
    public ModelAndView finalizar(HttpSession sessao, @ModelAttribute("venda") Venda venda){
        
        Venda vendaSession = (Venda) sessao.getAttribute("venda");
        vendaSession.setFormaPagamento(venda.getFormaPagamento());
        vendaSession.setNumeroCartao(venda.getNumeroCartao());
        vendaSession.setParcelas(venda.getParcelas());
        
        sessao.setAttribute("venda", vendaSession);
        
        repository.incluir(vendaSession);
        
        return new ModelAndView("ResumoCompra");
    }
}
