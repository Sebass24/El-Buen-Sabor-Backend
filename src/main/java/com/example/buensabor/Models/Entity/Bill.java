package com.example.buensabor.Models.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bill")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bill extends Base{
    private long number;

    @OneToOne
    @JoinColumn(name = "id_order")
    private Order order;

    private boolean cancelled;

}
