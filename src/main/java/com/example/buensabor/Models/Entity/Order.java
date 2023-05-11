package com.example.buensabor.Models.Entity;

import com.example.buensabor.Models.Enum.DeliveryMethod;
import com.example.buensabor.Models.Enum.OrderStatus;
import com.example.buensabor.Models.Enum.PaymentMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="new_order")
@Data //Getters and Setters
@Builder // Construye el objeto con patron Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order extends Base{

    @Enumerated(EnumType.STRING)
    private DeliveryMethod deliveryMethod;

    private Date date;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private Calendar estimatedTime;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private boolean paid;

    @ManyToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderDetail> orderDetails;

    private Double total;
    private Double discount;
}
