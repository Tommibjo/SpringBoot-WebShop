/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.services;

import com.mycompany.webshop.product.jpa.Product;
import com.mycompany.webshop.product.jpa.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tommib
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productrepository;

    public ProductService() {

    }

    public void initializeProducts() {
        productrepository.saveAndFlush(new Product("banana", 0.2));
        productrepository.saveAndFlush(new Product("apple", 0.15));
        productrepository.saveAndFlush(new Product("kiwi", 0.25));
        productrepository.saveAndFlush(new Product("Orange", 0.1));
    }
    
    public List getProducts(){
       return productrepository.findAll();
    }

}
