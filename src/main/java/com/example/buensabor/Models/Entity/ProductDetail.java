package com.example.buensabor.Models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_detail")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail extends Base{

    @OneToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    private double quantity;

    @ManyToOne
    private Product product;
}
