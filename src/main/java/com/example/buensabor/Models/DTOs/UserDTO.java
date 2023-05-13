package com.example.buensabor.Models.DTOs;

import com.example.buensabor.Models.FixedEntities.Role;

public record UserDTO(
        String userEmail,
        Role role,
        String name,
        String lastName
) {
}
