package com.ricky.springbootmall.service;

import com.ricky.springbootmall.dto.CreateOrderRequest;
import com.ricky.springbootmall.dto.OrderQueryParams;
import com.ricky.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
