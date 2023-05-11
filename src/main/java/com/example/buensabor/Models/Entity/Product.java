package com.example.buensabor.Models.Entity;

import com.example.buensabor.Models.Enum.ProductCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="product")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends Base{

    private String name;
    private String description;
    private String shortDescription;
    private boolean available;
    private Calendar cookingTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "product_category", nullable = false)
    private ProductCategory productCategory;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductDetail> productDetails;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Price> price;

    @OneToOne
    @JoinColumn(name = "id_recipe")
    private Recipe recipe;
}
