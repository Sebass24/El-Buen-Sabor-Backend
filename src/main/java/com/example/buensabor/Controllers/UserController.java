package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Services.Impl.UserServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/user")
public class UserController extends BaseControllerImpl<User, UserServiceImpl>{

    public UserController(UserServiceImpl service) {
        super(service);
    }


}
