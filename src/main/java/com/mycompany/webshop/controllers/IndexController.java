/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.controllers;

import com.mycompany.webshop.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author tommib
 */
@Controller
public class IndexController {
    
    @Autowired
    private SessionService sessionservice;
    
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String login(@RequestParam String name, @RequestParam String surname, @RequestParam String address){
       
        return "shop";
    }
    
    /* Sessionservice.status is true, if client has ongoing session*/
    @RequestMapping("/")
    public String loggedUser(){
        if(sessionservice.getStatus()){
            return "shop";
        }
        return "index";
    }
}
