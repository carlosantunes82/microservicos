package br.com.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/customers")
public class CustomerController {
 
	@Value("${spring.application.name}")
    private String appName;
    
    @Autowired
    private ApplicationContext context;
    
//    @GetMapping("/zuul-teste")
    @GetMapping
    public String getTestZuul() {
    	return "Application Spring Boot : " + appName + ":" + context.getEnvironment().getProperty("local.server.port");
    }
	
	
	
//    @GetMapping
//    public String findAll() {
//    	
//    	return "customers";
//    }
}

