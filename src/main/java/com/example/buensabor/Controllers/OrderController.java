package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Services.Impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/order")
public class OrderController extends BaseControllerImpl<Order, OrderServiceImpl>{

    private OrderServiceImpl service;

    public OrderController(OrderServiceImpl service) {
        super(service);
    }


}
