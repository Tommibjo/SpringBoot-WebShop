/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tommib
 */
@Controller
public class ShopController {
    
    @RequestMapping(value="/add")
    public String addProduct(){
        return "shop";
    }

}
