package com.Cart.eShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cart.eShop.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
	void deleteAllByCartId(Long id);

}
