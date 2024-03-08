package com.aung.eCommerceApp.repository;

import com.aung.eCommerceApp.model.ProdPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepo {

    List<ProdPost> products = new ArrayList<>();

    public ProductRepo() {
        // Initialize products here
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
        for(ProdPost product : products) {
            if(product.getProdId() == prodId) {
                return product;
            }
        }
        return null;
    }

    public void updateProduct(ProdPost prodPost) {
        for (ProdPost prodPost1 : products) {
            if (prodPost1.getProdId() == prodPost.getProdId()) {
                prodPost1.setProdName(prodPost.getProdName());
                prodPost1.setProdDesc(prodPost.getProdDesc());
                prodPost1.setProdPrice(prodPost.getProdPrice());
                prodPost1.setProdQuantity(prodPost.getProdQuantity());
            }
        }
    }

    public void deleteProduct(int prodId) {
        for(ProdPost prodPost : products) {
            if(prodPost.getProdId() == prodId) {
                products.remove(prodPost);
            }
        }
    }

}
