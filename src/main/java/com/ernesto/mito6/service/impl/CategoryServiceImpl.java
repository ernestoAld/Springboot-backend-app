package com.ernesto.mito6.service.impl;

import com.ernesto.mito6.models.Category;
import com.ernesto.mito6.repositories.ICategoryRepo;
import com.ernesto.mito6.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepo repo;

    @Override
    public Category save(Category category) throws Exception {
        return repo.save(category);
    }

    @Override
    public Category update(Category category) throws Exception {
        return repo.save(category);
    }

    @Override
    public List<Category> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Category readById(Integer id) throws Exception {
        Optional<Category> returned = repo.findById(id);
        if(returned.isPresent()){
            return returned.get();
        }
        throw new RuntimeException("CATEGORY WITH ID: "+id+" DOES NOT EXISTS");
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        Optional<Category> returned = repo.findById(id);
        if(returned.isEmpty()){
            throw new RuntimeException("CATEGORY WITH ID: "+id+" DOES NOT EXISTS");
        }else{
            repo.deleteById(id);
        }
    }
}
