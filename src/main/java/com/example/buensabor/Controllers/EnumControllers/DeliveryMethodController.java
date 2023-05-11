package com.example.buensabor.Controllers.EnumControllers;

import com.example.buensabor.Models.Enum.DeliveryMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/enum/deliverymethod")
public class DeliveryMethodController {
    @GetMapping("")
    public ResponseEntity<?> getAllEnums() {
        try {
            DeliveryMethod[] enums = DeliveryMethod.values();
            return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(enums));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}
