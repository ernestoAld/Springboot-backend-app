package com.ernesto.mito6.service.impl;

import com.ernesto.mito6.models.Category;
import com.ernesto.mito6.repositories.ICategoryRepo;
import com.ernesto.mito6.repositories.IGenericRepo;
import com.ernesto.mito6.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//Indicamos que esta clase va a extender los mismos metodos que CRUDImpl pero con un tipo distinto
//
@Service
public class CategoryServiceImpl extends CRUDImpl<Category,Integer> implements ICategoryService {

    @Autowired
    private ICategoryRepo repo;

    @Override
    protected IGenericRepo<Category, Integer> getRepo() {
        return repo;
    }
}

/*
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

    @Override
    public Category findByName(String name) {
        Optional<Category> category = repo.findByName(name);
        if(category.isEmpty()){
            throw new RuntimeException("CATEGORY '"+name+"' DOES NOT EXISTS");
        }
        return category.get();
    }
 */
