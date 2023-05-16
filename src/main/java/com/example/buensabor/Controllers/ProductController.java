package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Product;
import com.example.buensabor.Services.Impl.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/product")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl>{

    public ProductController(ProductServiceImpl service) {
        super(service);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<?> getByCategory(@PathVariable String category){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getByCategory(category));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getByName(name));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }


}
