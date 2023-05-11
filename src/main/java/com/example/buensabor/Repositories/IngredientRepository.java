package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.Ingredient;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends BaseRepository<Ingredient,Long> {
}
