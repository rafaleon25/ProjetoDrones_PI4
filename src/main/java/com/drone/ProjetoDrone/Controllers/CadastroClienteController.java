/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import javax.validation.Valid;
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
@RequestMapping("/cadastro")
public class CadastroClienteController {

    @PostMapping("/salvar")
    public ModelAndView realizarCadastro(@ModelAttribute("produto") @Valid Cliente cliente,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {
        
        
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/home/cadastro");
        }
        
        
        // falta codigo para incluir objeto no banco 
        //será add abaixo assim que o banco estiver adaptado para isso nas classes
        
        
        
        // verificar se esse sera relamente o redirect e se é assim
        //msm que se faz o redirect
        return new ModelAndView("Login");
    }

}
