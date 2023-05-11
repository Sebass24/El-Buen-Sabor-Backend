package com.example.buensabor.Models.Entity;

import com.example.buensabor.Models.Enum.MeasurementUnit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="ingredient")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient extends Base{
    private String name;

    @OneToOne
    @JoinColumn(name = "id_category")
    private IngredientCategory ingredientCategory;

    private int minimunStock;
    private int currentStock;

    @Enumerated(EnumType.STRING)
    @Column(name = "mesurementUnit", nullable = false)
    private MeasurementUnit measurementUnit;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingredient")
    private List<Price> prices;
}
