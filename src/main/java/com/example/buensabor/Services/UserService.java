package com.example.buensabor.Services;

import com.example.buensabor.Models.Entity.Address;
import com.example.buensabor.Models.Entity.Phone;
import com.example.buensabor.Models.Entity.User;

import java.util.List;

public interface UserService extends BaseService<User,Long> {
    //Agregamos todos los metodos que solo pertenecen a User, lo agregamos a la interfaz para mantener el orden
    //int getEdad(Long id);
    List<Address> getUserAddresses(Long userId);
    List<Phone> getUserPhones(Long userId);
}
