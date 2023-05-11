package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Repositories.OrderRepository;
import com.example.buensabor.Services.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order,Long> implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        super(orderRepository);
        this.orderRepository = orderRepository;
    }

}
