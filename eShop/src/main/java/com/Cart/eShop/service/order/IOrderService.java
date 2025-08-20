package com.Cart.eShop.service.order;

import java.util.List;

import com.Cart.eShop.Dto.OrderDto;
import com.Cart.eShop.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}