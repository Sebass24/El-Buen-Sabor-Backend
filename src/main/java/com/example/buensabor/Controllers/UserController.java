package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Services.Impl.UserServiceImpl;
import com.example.buensabor.Services.Mappers.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/user")
public class UserController extends BaseControllerImpl<User, UserServiceImpl>{

    private UserMapper userMapper;
    public UserController(UserServiceImpl service, UserMapper userMapper) {
        super(service);
        this.userMapper = userMapper;
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAllActive(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAllActive().stream().map(userMapper).collect(Collectors.toList()));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @Override
    @GetMapping("all")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("addresses/{id}")
    public ResponseEntity<?> getAddresses(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getUserAddresses(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("phones/{id}")
    public ResponseEntity<?> getPhones(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getUserPhones(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }


}
