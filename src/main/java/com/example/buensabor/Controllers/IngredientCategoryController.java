package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.IngredientCategory;
import com.example.buensabor.Services.Impl.IngredientCategoryServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/rubro")
public class IngredientCategoryController extends BaseControllerImpl<IngredientCategory, IngredientCategoryServiceImpl>{

    public IngredientCategoryController(IngredientCategoryServiceImpl service) {
        super(service);
    }
}
