package com.ernesto.mito6.controller;

import com.ernesto.mito6.models.Category;
import com.ernesto.mito6.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService service;

    @GetMapping
    public List<Category> readAll() throws Exception{
        return service.readAll();
    }

    @GetMapping("/{id}")
    public Category readById(@PathVariable Integer id) throws Exception{
        return service.readById(id);
    }

    @GetMapping("/name/{name}")
    public Category readByName(@PathVariable String name){
        return service.findByName(name);
    }

    @PostMapping
    public Category create(@RequestBody Category category) throws Exception{
        return service.save(category);
    }

    @PutMapping
    public Category update(@RequestBody Category category) throws Exception{
        return service.save(category);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteById( @PathVariable Integer id) throws Exception{
        service.deleteById(id);
    }

}
