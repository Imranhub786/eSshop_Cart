package com.Cart.eShop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cart.eShop.model.Order;
public interface OrderRepository extends JpaRepository<Order, Long> {
	 List<Order> findByUserId(Long userId);}
