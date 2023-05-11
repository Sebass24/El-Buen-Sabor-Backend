package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product,Long> {
}
