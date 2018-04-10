/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

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
public class HomeController {

    @GetMapping("/paginaInicial")
    public ModelAndView home() {
        return new ModelAndView("Home");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("Login");
    }

    @GetMapping("/carrinho")
    public ModelAndView carrinho() {
        return new ModelAndView("Cart");
    }
}
