package com.example.buensabor.Controllers.EnumControllers;

import com.example.buensabor.Models.Enum.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/enum/locations")
public class LocationController {
    @GetMapping("")
    public ResponseEntity<?> getAllEnums() {
        try {
            List<String> enums = Arrays.stream(Location.values()).map(loc->loc.getName()).collect(Collectors.toList());
            return ResponseEntity.status(HttpStatus.OK).body(enums);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}
