package com.example.buensabor.Services.Impl;

import com.example.buensabor.Exceptions.ServiceException;
import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Models.Entity.OrderDetail;
import com.example.buensabor.Models.Entity.Product;
import com.example.buensabor.Models.Entity.ProductDetail;
import com.example.buensabor.Repositories.OrderRepository;
import com.example.buensabor.Services.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order,Long> implements OrderService {

    private OrderRepository orderRepository;
    private OrderDetailServiceImpl orderDetailService;
    private ProductServiceImpl productService;
    private IngredientServiceImpl ingredientService;
    private OrderStatusServiceImpl orderStatusService;

    public OrderServiceImpl(OrderRepository orderRepository, OrderDetailServiceImpl orderDetailService, ProductServiceImpl productService, IngredientServiceImpl ingredientService, OrderStatusServiceImpl orderStatusService) {
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.orderDetailService = orderDetailService;
        this.productService = productService;
        this.ingredientService = ingredientService;
        this.orderStatusService = orderStatusService;
    }

    @Override
    @Transactional
    public Order save(Order entity) throws ServiceException {
        try {
            decrementIngredientStock(entity);
            List<OrderDetail> od = entity.getOrderDetails();

            od.forEach(orderDetail -> orderDetail.setOrder(entity));

            Order order = baseRepository.save(entity);
            return order;

        }catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Order update(Order entity) throws ServiceException {
        try {
            if (entity.getId() == null) {
                throw new ServiceException("La entidad a modificar debe contener un Id.");
            }

            List<OrderDetail> pd = entity.getOrderDetails();
            pd.forEach(orderDetail -> orderDetail.setOrder(entity));
            Order order = orderRepository.save(entity);

            return order;
        }catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }

    private void decrementIngredientStock(Order order){
        try{
            for (OrderDetail orderDetail : order.getOrderDetails())
            {
                for (ProductDetail productDetail : orderDetail.getProduct().getProductDetails())
                {
                    ingredientService.decrementStock(
                            productDetail.getIngredient().getId(),
                            productDetail.getQuantity(),
                            productDetail.getMeasurementUnit());

                }
            }
        }catch (Exception e){

        }

    }

    private void incrementIngredientStock(Order order){
        try{
            for (OrderDetail orderDetail : order.getOrderDetails())
            {
                for (ProductDetail productDetail : orderDetail.getProduct().getProductDetails())
                {
                    ingredientService.incrementStock(
                            productDetail.getIngredient().getId(),
                            productDetail.getQuantity(),
                            productDetail.getMeasurementUnit());

                }
            }
        }catch (Exception e){

        }

    }

    @Override
    public List<Order> getOrdersByDates(Date from, Date since) {
        return orderRepository.getOrdersByDates(from,since);
    }

    @Override
    public void changeStatus(Long orderId, Long newOrderStatusId) {
        try{
            Optional<Order> order = orderRepository.findById(orderId);
            order.get().setOrderStatus(orderStatusService.findById(newOrderStatusId));
            orderRepository.save(order.get());

            if (order.get().getOrderStatus().getDescription().equalsIgnoreCase("Cancelado")){
                incrementIngredientStock(order.get());
            }
        }
        catch (Exception e){

        }
    }

    @Override
    public List<Order> getByStatus(String status) {
        return orderRepository.getOrdersByStatus(status);
    }
    @Override
    public List<Order> getByStatusAndName(String status,Long id) {
        return orderRepository.getOrdersByStatusAndId(status, id);
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
