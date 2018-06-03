/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drone.ProjetoDrone.Classes.Login;

import org.cloudfoundry.identity.uaa.login.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 *
 * @author Josué
 */
@Component
    public class EmailServiceImpl extends EmailService {
    @Autowired
    public JavaMailSender emailSender;

    public EmailServiceImpl(JavaMailSender mailSender, String loginUrl, String brand) {
        super(mailSender, loginUrl, brand);
    }
 
    public void sendSimpleMessage(
      String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        emailSender.send(message);
    }
}
