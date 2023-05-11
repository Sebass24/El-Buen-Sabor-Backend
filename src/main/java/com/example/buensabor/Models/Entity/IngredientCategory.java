package com.example.buensabor.Models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="ingredient_category")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientCategory extends Base{
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentCategory")
    private List<IngredientCategory> subIngredientCategories;

    @ManyToOne
    private IngredientCategory parentCategory;

}
