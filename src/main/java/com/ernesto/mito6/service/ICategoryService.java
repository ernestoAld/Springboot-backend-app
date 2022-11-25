package com.ernesto.mito6.service;

import com.ernesto.mito6.models.Category;

import java.util.List;

public interface ICategoryService {

    Category save(Category category) throws Exception;
    Category update(Category category) throws Exception;
    List<Category> readAll() throws Exception;
    Category readById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;

}
