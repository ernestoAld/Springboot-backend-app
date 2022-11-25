package com.ernesto.mito6.repositories;

import com.ernesto.mito6.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICategoryRepo extends IGenericRepo<Category,Integer> {
    Optional<Category> findByName(String name);
}
