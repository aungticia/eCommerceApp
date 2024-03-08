package com.aung.eCommerceApp.service;

import com.aung.eCommerceApp.model.ProdPost;
import com.aung.eCommerceApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepo repo;

    // Constructor-based dependency injection
    @Autowired
    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    public void addProduct(ProdPost prodPost) {
        repo.save(prodPost);
    }

    public List<ProdPost> getAllProducts() {
        return repo.findAll();
    }

    public ProdPost getProduct(int prodId) {
        return repo.findById(prodId).orElse(new ProdPost());
    }

    public void updateProduct(ProdPost prodPost) {
        repo.save(prodPost);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    public void load() {
        List<ProdPost> products = List.of(
                new ProdPost(1, "Phone", "Apple iPhone 13 pro max", 999, 2),
                new ProdPost(2, "Computer", "Apple MacBook Pro", 1499, 3)
        );
        repo.saveAll(products);
    }
}
