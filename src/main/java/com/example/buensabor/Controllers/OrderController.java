package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Services.Impl.OrderServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/order")
public class OrderController extends BaseControllerImpl<Order, OrderServiceImpl>{

    private OrderServiceImpl service;

    public OrderController(OrderServiceImpl service) {
        super(service);
    }

    @GetMapping("byStatus/{status}")
    public ResponseEntity<?> getById(@PathVariable String status){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getByStatus(status));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

}
