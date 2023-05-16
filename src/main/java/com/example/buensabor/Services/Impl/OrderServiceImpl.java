package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Models.Entity.OrderDetail;
import com.example.buensabor.Repositories.OrderRepository;
import com.example.buensabor.Services.OrderService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order,Long> implements OrderService {

    private OrderRepository orderRepository;
    private OrderDetailServiceImpl orderDetailService;
    private ProductServiceImpl productService;

    public OrderServiceImpl(OrderRepository orderRepository, OrderDetailServiceImpl orderDetailService, ProductServiceImpl productService) {
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.orderDetailService = orderDetailService;
        this.productService = productService;
    }

    @Override
    public List<Order> getOrdersByDates(Date from, Date since) {
        return orderRepository.getOrdersByDates(from,since);
    }

    @Override
    public List<Order> getByStatus(String status) {
        return orderRepository.getOrdersByStatus(status);
    }

    @Override
    public Double getCost(Order order) {

        double cost = 0;
        for (OrderDetail orderDetail : order.getOrderDetails()) {
            cost += productService.getProductCost(orderDetail.getProduct());
        }
        return cost;
    }

    @Override
    public Double getGain(Order order) {

        double cost = getCost(order);
        double income = getIncome(order);
        return (income - cost);
    }

    @Override
    public Double getIncome(Order order) {
        double income = 0;
        for (OrderDetail orderDetail : order.getOrderDetails()) {
            income += orderDetailService.getOrderDetailPrice(orderDetail);
        }
        return  income;
    }

}
