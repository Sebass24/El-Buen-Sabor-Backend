package com.example.buensabor.Models.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="image")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class Image extends Base{
    private String name;
    private String path;
}
