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
@Builder // Construye el objeto con patron Builder
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
    @JoinColumn(name = "id_phone")
    private Phone phoneNumber;

    @OneToOne
    @JoinColumn(name = "id_address")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    List<Order> orders;
}
