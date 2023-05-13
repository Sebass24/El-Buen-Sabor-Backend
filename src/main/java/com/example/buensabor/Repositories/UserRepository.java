package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {
    @Query("SELECT c.name, COUNT(o) as num_ordenes " +
            "FROM User c " +
            "JOIN Order o ON c.id = o.user.id " +
            "GROUP BY c.id " +
            "ORDER BY num_ordenes DESC")
    List<Object[]> getTop5Users();
}
