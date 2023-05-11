package com.example.buensabor.Services;

import com.example.buensabor.Models.Entity.User;

public interface UserService extends BaseService<User,Long> {
    //Agregamos todos los metodos que solo pertenecen a User, lo agregamos a la interfaz para mantener el orden
    //int getEdad(Long id);
}
