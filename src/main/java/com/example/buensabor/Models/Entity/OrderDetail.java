package com.example.buensabor.Models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="order_detail")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail extends Base{
    @OneToOne
    @JoinColumn(name = "id_product")
    private Product product;

    private double quantity;

    @ManyToOne
    private Order order;
}
