package com.example.buensabor.Models.DTOs;

import com.example.buensabor.Models.Entity.Address;
import com.example.buensabor.Models.Entity.Phone;
import com.example.buensabor.Models.Enum.Role;

public record UserDTO(
        String userEmail,
        Role role,
        String name,
        String lastName,
        Phone phoneNumber,
        Address address
) {
}
