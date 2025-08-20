package com.Cart.eShop.service.cart;

import java.math.BigDecimal;

import com.Cart.eShop.model.Cart;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    Cart getCartByUserId(Long userId);
}