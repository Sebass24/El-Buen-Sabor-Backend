package com.example.buensabor.Repositories;

import com.example.buensabor.Exceptions.RepositoryException;
import com.example.buensabor.Models.Entity.IngredientCategory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientCategoryRepository extends BaseRepository<IngredientCategory,Long>{

    @Query("select ic from IngredientCategory ic where ic.parentCategory = :catId")
    List<IngredientCategory> getChildren(@Param("catId") Long catId) throws RepositoryException;

}
