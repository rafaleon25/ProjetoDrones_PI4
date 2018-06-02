/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Classes.Venda.Venda;
import com.drone.ProjetoDrone.Repository.AcompanhaRepository;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafael Rodrigues
 */
@Controller
@RequestMapping("/Acomp")
public class AcompanhamentoPedController {
    
    @Autowired
    AcompanhaRepository repository;
    
    @GetMapping
    public ModelAndView acompanhamentoTela(HttpSession sessao){
        Cliente cli = (Cliente) sessao.getAttribute("usuario");
        try {
            List<Venda> listaAcomp = repository.listarVendas(cli.getIdCli());
        } catch (Exception e) {
            return new ModelAndView("Home");
        }
        return new ModelAndView("AcomPedido");
    }
    
}
