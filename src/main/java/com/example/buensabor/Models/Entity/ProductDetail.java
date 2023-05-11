package com.example.buensabor.Models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_detail")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail extends Base{

    @OneToOne
    @JoinColumn(name = "id_ingredient")
    private Ingredient ingredient;

    private double quantity;

    @ManyToOne
    private Product product;
}
