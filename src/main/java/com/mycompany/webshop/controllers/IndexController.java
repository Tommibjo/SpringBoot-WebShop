/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.controllers;

import com.mycompany.webshop.services.CartService;
import com.mycompany.webshop.services.ProductService;
import com.mycompany.webshop.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Autowired
    private CartService cartservice;
    @Autowired
    private ProductService productservice;
    

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(@RequestParam String owner, @RequestParam String deliveryAddress) {
        cartservice.createCart(owner, deliveryAddress);
        productservice.initializeProducts(); // This is just to initialize products to shop for purchase
        return "shop";
    }

    /* Sessionservice.status is true, if client has ongoing session*/
    @RequestMapping("/")
    public String loggedUser(Model model) {
        if (sessionservice.getStatus()) {
            model.addAttribute("products", productservice.getProducts());
            return "shop";
        }
        return "index";
    }

    /*Tämä lisää ID:n mukaisen tuotteen kärryyn*/
    @RequestMapping(value = "/cart/{id}/add/{id}", method = RequestMethod.POST)
    public String addProduct(@PathVariable Integer id) {
        
        return "redirect:/";
    }

    /*Tämä poistaa ID:n mukaisen tuotteen kärrystä*/
    @RequestMapping(value = "/cart/{id}/remove/{id}", method = RequestMethod.POST)
    public String removeProduct(@PathVariable Integer id) {
        return "redirect:/";
    }

    @RequestMapping("/cart/{id}")
    public String shoppingCart() {
        return "cart";
    }

}
