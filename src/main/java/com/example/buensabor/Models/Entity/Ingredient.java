package com.example.buensabor.Models.Entity;

import com.example.buensabor.Models.FixedEntities.MeasurementUnit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="ingredient")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient extends Base{
    private String name;

    @OneToOne
    @JoinColumn(name = "category_id")
    private IngredientCategory ingredientCategory;

    private int minimunStock;
    private int currentStock;

    @Enumerated(EnumType.STRING)
    @Column(name = "mesurementUnit", nullable = false)
    private MeasurementUnit measurementUnit;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingredient")
    private List<Price> prices;
}
