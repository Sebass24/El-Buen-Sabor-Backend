package com.example.buensabor.Services;

import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Models.Entity.Product;

import java.util.Date;
import java.util.List;

public interface OrderService extends BaseService<Order,Long> {
    //Agregamos todos los metodos que solo pertenecen a User, lo agregamos a la interfaz para mantener el orden

    public List<Order> getOrdersFromTo(Date from, Date to);
    public List<Order> getByStatus(Date from, Date to);
    public List<Order> getOrderContainingProduct(Product product);
    public Double getCost(List<Order> orders);
    public Double getGain(List<Order> orders);
    public Double getIncome(List<Order> orders);

}
