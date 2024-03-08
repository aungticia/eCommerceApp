package com.aung.eCommerceApp.repository;

import com.aung.eCommerceApp.model.ProdPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepo {

    private static final List<ProdPost> products = new ArrayList<>();

    public ProductRepo() {
        // Initialize your products here
        products.add(new ProdPost(1, "Phone", "Apple iPhone 13 pro max", 999, 2));
        products.add(new ProdPost(2, "Computer", "Apple MacBook Pro", 1499, 3));
    }

    public List<ProdPost> getAllProducts() {
        return products;
    }

    public void addProduct(ProdPost prod) {
        products.add(prod);
    }

    public ProdPost getProduct(int prodId) {
        return products.stream()
                .filter(product -> product.getProdId() == prodId)
                .findFirst()
                .orElse(null);
    }

    public void updateProduct(ProdPost prodPost) {
        products.stream()
                .filter(p -> p.getProdId() == prodPost.getProdId())
                .findFirst()
                .ifPresent(p -> {
                    p.setProdName(prodPost.getProdName());
                    p.setProdDesc(prodPost.getProdDesc());
                    p.setProdPrice(prodPost.getProdPrice());
                    p.setProdQuantity(prodPost.getProdQuantity());
                });
    }

    public void deleteProduct(int prodId) {
        products.removeIf(prodPost -> prodPost.getProdId() == prodId);
    }

    public double calculateTotalPrice() {
        return products.stream()
                .mapToDouble(prod -> prod.getProdPrice() * prod.getProdQuantity())
                .sum();
    }


}
