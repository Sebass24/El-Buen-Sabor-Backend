package com.example.buensabor.Models.Entity;

import com.example.buensabor.Models.Enum.Location;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="address")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address extends Base{
    private String street;
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(name = "location", nullable = false)
    private Location location;
}
