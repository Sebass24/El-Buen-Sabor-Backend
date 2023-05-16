package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Models.Entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends BaseRepository<Order,Long> {

    @Query("select o from Order o where o.date > :from and o.date < :since")
    List<Order> getOrdersByDates(@Param("from") Date from, @Param("since") Date since);

    @Query("select o from Order o where o.orderStatus.description = :status")
    List<Order> getOrdersByStatus(@Param("status") String status);


}
