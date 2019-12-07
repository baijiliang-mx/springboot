package com.data.springboot.sweb.web;

import com.data.springboot.sservice.service.Sservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sweb {

    @Autowired
    private Sservice sservice;

    @RequestMapping("/hello")
    public String sweb() {
        return sservice.list();
    }
}
