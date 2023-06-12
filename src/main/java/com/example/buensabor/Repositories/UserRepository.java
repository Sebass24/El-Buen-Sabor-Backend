package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {
    @Query("SELECT c, COUNT(o) as ordenes, Sum(o.total) as price " +
            "FROM User c " +
            "JOIN Order o ON c.id = o.user.id " +
            "GROUP BY c.id " +
            "ORDER BY ordenes desc")
    List<Object> getTop5UsersOrders(Pageable pageable);

    @Query("SELECT c, COUNT(o) as ordenes, Sum(o.total) as price " +
            "FROM User c " +
            "JOIN Order o ON c.id = o.user.id " +
            "GROUP BY c.id " +
            "ORDER BY price desc")
    List<Object> getTop5UsersPrice(Pageable pageable);

    @Query("SELECT c, COUNT(o) as ordenes, Sum(o.total) as price  " +
            "FROM User c " +
            "JOIN Order o ON c.id = o.user.id " +
            "WHERE o.date BETWEEN :startDate AND :endDate " +
            "GROUP BY c.id " +
            "ORDER BY ordenes desc ")
    List<Object> getUsersWithMostOrders(@Param("startDate") Date startDate,
                                      @Param("endDate") Date endDate, Pageable pageable);

    @Query("SELECT c, COUNT(o) as ordenes, Sum(o.total) as price  " +
            "FROM User c " +
            "JOIN Order o ON c.id = o.user.id " +
            "WHERE o.date BETWEEN :startDate AND :endDate " +
            "GROUP BY c.id " +
            "ORDER BY price desc ")
    List<Object> getUsersWithMostPrice(@Param("startDate") Date startDate,
                                        @Param("endDate") Date endDate, Pageable pageable);

    User getUserByAuth0Id (String id);
}
