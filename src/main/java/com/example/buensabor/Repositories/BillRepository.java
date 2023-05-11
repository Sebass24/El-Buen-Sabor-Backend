package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.Bill;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends BaseRepository<Bill,Long> {
}
