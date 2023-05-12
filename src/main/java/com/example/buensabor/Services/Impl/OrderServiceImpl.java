package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Models.Entity.Product;
import com.example.buensabor.Repositories.OrderRepository;
import com.example.buensabor.Services.OrderService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order,Long> implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        super(orderRepository);
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getOrdersFromTo(Date from, Date to) {
        return null;
    }

    @Override
    public List<Order> getByStatus(Date from, Date to) {
        return null;
    }

    @Override
    public List<Order> getOrderContainingProduct(Product product) {
        return null;
    }

    @Override
    public Double getCost(List<Order> orders) {
        return null;
    }

    @Override
    public Double getGain(List<Order> orders) {
        return null;
    }

    @Override
    public Double getIncome(List<Order> orders) {
        return null;
    }
}
