package br.com.products.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;
 
@RestController
@RequestMapping("/products")
public class ProductController {
 
    @GetMapping
    public String findAll() {
    	return "products";
    }
}