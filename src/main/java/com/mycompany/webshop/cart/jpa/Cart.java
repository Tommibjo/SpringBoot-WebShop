/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.cart.jpa;

import com.mycompany.webshop.product.jpa.Product;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author tommib
 */
@Entity
public class Cart extends AbstractPersistable<Long>{

    @Id
    private Long id;
    private String owner;
    private String deliveryAddress;
    @OneToMany
    private List<Product> content;

    public Cart() {

    }

    public Cart(String owner, String deliveryAddress) {
        this.owner = owner;
        this.deliveryAddress = deliveryAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
