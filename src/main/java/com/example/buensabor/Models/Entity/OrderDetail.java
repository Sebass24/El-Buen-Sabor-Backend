package com.example.buensabor.Models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="order_detail")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail extends Base{
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private double quantity;

    @ManyToOne
    private Order order;
}
