package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Product;
import com.example.buensabor.Services.Impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/product")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl>{

    public ProductController(ProductServiceImpl service) {
        super(service);
    }


}
