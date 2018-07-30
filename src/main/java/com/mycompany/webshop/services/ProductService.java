/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.services;

import com.mycompany.webshop.product.jpa.Product;
import com.mycompany.webshop.product.jpa.ProductRepository;
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
    /*    productrepository.saveAndFlush(new Product("Apple", 0.2));
        productrepository.saveAndFlush(new Product("Banana", 0.1));
        productrepository.saveAndFlush(new Product("Kiwi", 0.15));
        productrepository.saveAndFlush(new Product("Oragen", 0.1));*/
    }
    
}
