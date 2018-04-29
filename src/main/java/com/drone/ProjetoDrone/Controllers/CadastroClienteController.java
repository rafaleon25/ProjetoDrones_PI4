/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Repository.ClienteRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Rafael Rodrigues
 */
@Controller
@RequestMapping("/cadastrar")
public class CadastroClienteController {

    @Autowired
    private ClienteRepository repository;
    
    @PostMapping("/salvar")
    public ModelAndView realizarCadastro(@ModelAttribute("produto") @Valid Cliente cliente,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {
        
        
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/home/cadastro");
        }
        
        repository.incluir(cliente);
        
        return new ModelAndView("Login");
    }

}
