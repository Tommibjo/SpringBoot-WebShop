/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webshop.services;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tommib
 */
@Service
public class SessionService {

    @Autowired
    private HttpSession session;

    public boolean getStatus() {
        if(session.getAttribute("online") != null){
            return true;
        }
        session.setAttribute("online", true);
        return false;
    }

}
