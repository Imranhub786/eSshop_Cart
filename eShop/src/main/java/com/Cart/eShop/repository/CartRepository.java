package com.Cart.eShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cart.eShop.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	Cart findByUserId(Long userId);

}
