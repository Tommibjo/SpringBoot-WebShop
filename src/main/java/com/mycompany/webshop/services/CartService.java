/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.services;

import com.mycompany.webshop.cart.jpa.Cart;
import com.mycompany.webshop.cart.jpa.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tommib
 */
@Service
public class CartService {
     
    @Autowired
    private CartRepository cartrepository;
    
    public void createCart(String owner, String deliveryAddress){
        cartrepository.saveAndFlush(new Cart(owner, deliveryAddress));
    }
    
    public void addProduct(){
        
    }
}
