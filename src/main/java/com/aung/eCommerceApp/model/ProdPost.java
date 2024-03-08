package com.aung.eCommerceApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class ProdPost {

    @Id
    private int prodId;
    private String prodName;
    private String prodDesc;
    private double prodPrice;
    private int prodQuantity;

}
