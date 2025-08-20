package com.Cart.eShop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Cart.eShop.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

}
