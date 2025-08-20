package com.Cart.eShop.request;

import java.math.BigDecimal;
import com.Cart.eShop.model.Category; // <-- This is the correct one

import lombok.Data;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;

}
