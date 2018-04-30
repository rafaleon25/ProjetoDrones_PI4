/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Classes.Login.Login;
import com.drone.ProjetoDrone.Repository.ClienteRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Rafael Rodrigues
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping("/telaLogin")
    public ModelAndView login() {
        return new ModelAndView("Login").addObject("login", new Login());
    }

    public ModelAndView lagando(@ModelAttribute("login") @Valid Login login, BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("/telaLogin");
        }

        Cliente cli = new Cliente();

        cli = repository.logar(login.getUser(), login.getSenha());

        if (cli != null) {
            return new ModelAndView("/telaLogin");
        }

        if (cli.getEmail().equals(login.getUser()) && cli.getSenha().equals(login.getSenha())) {
            
        }

    }

}
