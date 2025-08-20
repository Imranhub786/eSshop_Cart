package com.Cart.eShop.service.user;

import com.Cart.eShop.model.User;

import com.Cart.eShop.Dto.UserDto;
import com.Cart.eShop.request.CreateUserRequest;
import com.Cart.eShop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}