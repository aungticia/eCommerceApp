package com.aung.eCommerceApp.controller;


import com.aung.eCommerceApp.model.ProdPost;
import com.aung.eCommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("prodPosts")
    public List<ProdPost> getAllProducts() {
        return service.getAllProducts();

    }

    @GetMapping("/prodPost/{prodId}")
    public ProdPost getProduct(@PathVariable int prodId) {
        return service.getProduct(prodId);
    }

    @PostMapping("prodPost")
    public ProdPost addProduct(@RequestBody ProdPost prodPost) {
        service.addProduct(prodPost);
        return service.getProduct(prodPost.getProdId());
    }

    @PutMapping("prodPost")
    public ProdPost updateProduct(@RequestBody ProdPost prodPost) {
        service.updateProduct(prodPost);
        return service.getProduct(prodPost.getProdId());
    }

    @DeleteMapping("prodPost/{prodId}")
    public String deleteProduct(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);
        return "Deleted";
    }
}
