package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends BaseRepository<Product,Long> {

//    @Query("select o from Order o where o.de)
//    List<Product> search(@Param("filtro") String filtro);
}
