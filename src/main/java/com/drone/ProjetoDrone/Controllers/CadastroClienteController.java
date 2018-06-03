/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Controllers;

import com.drone.ProjetoDrone.Classes.Cliente.Cliente;
import com.drone.ProjetoDrone.Classes.Login.CriptoSenha;
import com.drone.ProjetoDrone.Repository.ClienteRepository;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/cadastrar/cliente")
public class CadastroClienteController {

    @Autowired
    private ClienteRepository repository;
    
    // O /cadastro é o redirecionamento para a tela de formulario de cadastro de cliente
    // retorno um html CADASTRO e add um objeto que o html irá preencher pelos metodos definidos.
    @GetMapping("/cadastro")
    public ModelAndView cadastroCli(){
        return new ModelAndView ("Cadastro").addObject("cliente", new Cliente());
    }
    
    
    @PostMapping("/salvar")
    public ModelAndView realizarCadastro(@ModelAttribute("cliente") @Valid Cliente cliente,BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("/cadastro");
        }

        try {
            CriptoSenha criptografia = new CriptoSenha();
            String senhaCripto = criptografia.cripto(cliente.getSenha());
            cliente.setSenha(senhaCripto);
            repository.incluir(cliente);
        } catch (Exception e) {
            return new ModelAndView("Cadastro");
        }
        

        return new ModelAndView("redirect:/login/telaLogin");
    }
    
    @PostMapping("/salvarAlteracao")
    public ModelAndView realizarAlteracao(@ModelAttribute("cliente") @Valid Cliente cliente,BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("/cadastro");
        }

        try {
            repository.incluir(cliente);
        } catch (Exception e) {
            return new ModelAndView("Cadastro");
        }
        

        return new ModelAndView("Home");
    }

    @GetMapping("/alterar")
    public ModelAndView TelaAlterar(HttpSession sessao){ 
        Cliente cliente = (Cliente) sessao.getAttribute("usuario");
        return new ModelAndView("AlterarCadastro").addObject("cliente", cliente);
    }
    
    
}
