/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafael Rodrigues
 */
@Controller
@RequestMapping("/home")
public class RedirecionamentosController {

    @GetMapping("/paginaInicial")
    public ModelAndView home() {
        return new ModelAndView("Home");
    }
    @GetMapping("/desc")
    public ModelAndView desc() {
        return new ModelAndView("DescProd");
    }
    

    @GetMapping("/carrinho")
    public ModelAndView carrinho() {
        return new ModelAndView("Cart");
    }
    
    @GetMapping("/contato")
    public ModelAndView contato(){
        return new ModelAndView("Contato");
    }
    
    @GetMapping("/ajuda")
    public ModelAndView ajuda(){
        return new ModelAndView("Ajuda");
    }
    
    
}
