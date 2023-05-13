package com.example.buensabor.Services.Mappers;

import com.example.buensabor.Models.DTOs.UserDTO;
import com.example.buensabor.Models.Entity.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserMapper implements Function<User, UserDTO> {

    @Override
    public UserDTO apply(User user) { //Usar mapStruct (libreria)
        return new UserDTO(
                user.getUserEmail(),
                user.getRole(),
                user.getName(),
                user.getLastName()
        );
    }
}
