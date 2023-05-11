package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends BaseRepository<Order,Long> {
}
