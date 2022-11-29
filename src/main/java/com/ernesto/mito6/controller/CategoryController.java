package com.ernesto.mito6.controller;

import com.ernesto.mito6.exceptions.ModelNotFoundException;
import com.ernesto.mito6.models.Category;
import com.ernesto.mito6.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> readAll() throws Exception{
        List<Category> categories = service.readAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> readById(@PathVariable Integer id) throws Exception{
        Category category = service.readById(id);
        if(category == null){
            throw new ModelNotFoundException("Category with ID: "+id+" NOT FOUND");
        }
        return new ResponseEntity<>(category,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category) throws Exception{
        Category saved = service.save(category);
        return new ResponseEntity<>(saved,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Category> update(@RequestBody Category category) throws Exception{
        Category updated = service.save(category);
        return new ResponseEntity<>(updated,HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> deleteById( @PathVariable Integer id) throws Exception{
        try{
            service.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            throw new ModelNotFoundException("CATEGORY #"+id+" NOT FOUND");
        }

    }

}