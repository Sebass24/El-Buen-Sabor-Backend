package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Ingredient;
import com.example.buensabor.Services.Impl.IngredientServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/ingredient")
public class IngredientController extends BaseControllerImpl<Ingredient, IngredientServiceImpl>{

    public IngredientController(IngredientServiceImpl service) {
        super(service);
    }


}
