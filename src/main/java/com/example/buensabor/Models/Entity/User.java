package com.example.buensabor.Models.Entity;

import com.example.buensabor.Models.FixedEntities.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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

    @OneToOne
    private Role role;

    private String name;
    private String lastName;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//    private List<Address> addresses;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//    private List<Phone> phones;

}
