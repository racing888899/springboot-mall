package com.ricky.springbootmall.service;

import com.ricky.springbootmall.dto.CreateOrderRequest;
import com.ricky.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
