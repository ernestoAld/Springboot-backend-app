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