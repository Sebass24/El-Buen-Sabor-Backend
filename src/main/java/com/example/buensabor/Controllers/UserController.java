package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Services.Impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/user")
public class UserController extends BaseControllerImpl<User, UserServiceImpl>{

    public UserController(UserServiceImpl service) {
        super(service);
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
