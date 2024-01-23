package br.com.mandacaru.livecodebdd.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    public List<String> getAllProducts(){

        List<String> products = new ArrayList<String>();

        products.add("chave");

        return  products;
    }
}
