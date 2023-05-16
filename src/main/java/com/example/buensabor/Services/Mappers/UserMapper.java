package com.example.buensabor.Services.Mappers;

import com.example.buensabor.Models.DTOs.UserDTO;
import com.example.buensabor.Models.Entity.Address;
import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Repositories.AddressRepository;
import com.example.buensabor.Repositories.PhoneRepository;
import com.example.buensabor.Services.Impl.AddressServiceImpl;
import com.example.buensabor.Services.Impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class UserMapper implements Function<User, UserDTO> {

    private AddressServiceImpl addressService;
    private PhoneServiceImpl phoneService;

    public UserMapper(AddressServiceImpl addressService, PhoneServiceImpl phoneService) {
        this.addressService = addressService;
        this.phoneService = phoneService;
    }

    @Override
    public UserDTO apply(User user) { //Usar mapStruct (libreria)

        return new UserDTO(
                user.getUserEmail(),
                user.getRole(),
                user.getName(),
                user.getLastName(),
                addressService.getAddressesbyUser(user.getId()),
                phoneService.getPhonesByUser(user.getId())
        );
    }
}
