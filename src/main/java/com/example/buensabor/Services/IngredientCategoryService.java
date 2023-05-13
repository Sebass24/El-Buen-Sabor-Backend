package com.example.buensabor.Services;

import com.example.buensabor.Exceptions.RepositoryException;
import com.example.buensabor.Models.Entity.IngredientCategory;

import java.util.List;

public interface IngredientCategoryService extends BaseService<IngredientCategory,Long>{
    List<IngredientCategory> getCategoryChildren(Long categoryId) throws RepositoryException;
}
