package com.example.buensabor.Repositories;

import com.example.buensabor.Models.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {
}
