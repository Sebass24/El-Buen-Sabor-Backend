package com.example.buensabor.Services;

import com.example.buensabor.Models.Entity.IngredientCategory;

import java.util.List;

public interface IngredientCategoryService extends BaseService<IngredientCategory,Long>{
    void recursiveDelete(IngredientCategory ingredientCategory);
    List<IngredientCategory> getAllParents();
}
