package com.example.buensabor.Models.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="recipe")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class Recipe extends Base{
    private String description;
}
