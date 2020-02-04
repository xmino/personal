package com.ca.xmino.controllers;

import com.ca.xmino.TO.Head;
import com.ca.xmino.services.HeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HomeController {

    @Autowired
    private HeadService headService;

    public HomeController() {
    }

    @RequestMapping("/header")
    public Iterable<Head> header(){

       /* List<Head> head = new ArrayList<Head>();
        headService.getAllHead().forEach(e -> head.add(e)); */

        return headService.getAllHead();
    }

    @RequestMapping("/heading/{id}")
    public Optional<Head> headerId(@PathVariable String id) {


        return headService.getHeadById(id);


    }


    @RequestMapping("/")
    public String test(){
        return "Hi";
    }

}
