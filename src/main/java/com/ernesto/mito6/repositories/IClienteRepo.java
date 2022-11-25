package com.ernesto.mito6.repositories;

import com.ernesto.mito6.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepo extends JpaRepository<Category,Integer> {

    Category findByName(String name);

}
