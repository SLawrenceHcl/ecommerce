package com.sample.ecommerce.controller;

import com.sample.ecommerce.model.Product;
import com.sample.ecommerce.service.ProductService;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    KieContainer kieContainer;


//    @Autowired
//    DroolsConfig droolsConfig;
    //private final KieContainer kieContainer = droolsConfig.getKieContainer();

    @PostMapping("/createProduct")
    public Mono<Product> CreateProduct(@RequestBody Product product){
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(product);
        kieSession.fireAllRules();
        System.out.println(product.getStock());
        kieSession.dispose();
        //return product.getStock();
        return productService.CreateProduct(product);
    }

    @GetMapping("/getAllProducts")
    public Flux<Product> GetAllProducts(){
        return productService.GetAllProducts();
    }
}
