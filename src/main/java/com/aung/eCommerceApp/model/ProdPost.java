package com.aung.eCommerceApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

public class ProdPost {


    private int prodId;
    private String prodName;
    private String prodDesc;
    private double prodPrice;
    private int prodQuantity;

}
