package com.example.buensabor.Models.Entity;

import com.example.buensabor.Models.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="user")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class User extends Base {

    private String userEmail;
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    private String name;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "phone_id")
    private Phone phoneNumber;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
