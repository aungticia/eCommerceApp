package com.aung.eCommerceApp.service;

import com.aung.eCommerceApp.model.ProdPost;
import com.aung.eCommerceApp.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductRepo repo;

    public List<ProdPost> getAllProducts() {
        return repo.getAllProducts();
    }

    public void addProduct(ProdPost prodPost) {
        repo.addProduct(prodPost);

    }

    public ProdPost getProduct(int prodId) {
        return repo.getProduct(prodId);
    }

    public void updateProduct(ProdPost prodPost) {
        repo.updateProduct(prodPost);
    }

    public void deleteProduct(int prodId) {
        repo.deleteProduct(prodId);
    }
}
