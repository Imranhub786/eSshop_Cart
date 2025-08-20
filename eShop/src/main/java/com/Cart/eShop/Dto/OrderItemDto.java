package com.Cart.eShop.Dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderItemDto {
    private Long productId;
    private String productName;
    private int quantity;
    private BigDecimal price;
}