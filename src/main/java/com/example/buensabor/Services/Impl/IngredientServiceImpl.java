package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Ingredient;
import com.example.buensabor.Repositories.IngredientRepository;
import com.example.buensabor.Services.IngredientService;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl extends BaseServiceImpl<Ingredient,Long> implements IngredientService {

    private IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        super(ingredientRepository);
        this.ingredientRepository = ingredientRepository;
    }

}
