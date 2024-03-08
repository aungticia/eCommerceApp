package com.aung.eCommerceApp.repository;


import com.aung.eCommerceApp.model.ProdPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepo extends JpaRepository<ProdPost, Integer> {

}
