package com.example.buensabor.Services.Mappers;

import com.example.buensabor.Models.DTOs.UserDTO;
import com.example.buensabor.Models.Entity.Address;
import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Repositories.AddressRepository;
import com.example.buensabor.Repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class UserMapper implements Function<User, UserDTO> {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public UserDTO apply(User user) { //Usar mapStruct (libreria)

        return new UserDTO(
                user.getUserEmail(),
                user.getRole(),
                user.getName(),
                user.getLastName(),
                addressRepository.getAddresByUser(user.getId()),
                phoneRepository.getPhonesByUser(user.getId())
        );
    }
}
