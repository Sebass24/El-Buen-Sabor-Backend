package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.IngredientCategory;
import com.example.buensabor.Repositories.IngredientCategoryRepository;
import com.example.buensabor.Services.IngredientCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IngredientCategoryServiceImpl extends BaseServiceImpl<IngredientCategory,Long> implements IngredientCategoryService {

    private IngredientCategoryRepository ingredientCategoryRepository;
    public IngredientCategoryServiceImpl(IngredientCategoryRepository ingredientCategoryRepository) {
        super(ingredientCategoryRepository);
        this.ingredientCategoryRepository = ingredientCategoryRepository;
    }

    @Override
    @Transactional
    public boolean delete(Long id){
        return false;
    }

    @Override
    public void recursiveDelete(IngredientCategory ingredientCategory) {

    }

    @Override
    public List<IngredientCategory> getAllParents() {
        return null;
    }
}
