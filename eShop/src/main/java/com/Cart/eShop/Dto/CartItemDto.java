package com.Cart.eShop.Dto;
import java.math.BigDecimal;
import com.Cart.eShop.model.Product;
public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}