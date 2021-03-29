package com.example.Lisenkova.controller;

import com.example.Lisenkova.entity.Category;
import com.example.Lisenkova.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryApiController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryApiController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping(value = "")
    public ResponseEntity<?> create(@RequestBody Category category){
        categoryService.create(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/categories")
    public ResponseEntity<List<Category>> findAll() {
        final List<Category> categoryList = categoryService.findAll();

        return categoryList != null && !categoryList.isEmpty()
                ? new ResponseEntity<>(categoryList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/categories/{id}")
    public ResponseEntity<Category> find(@PathVariable(name="id") Long id){
        final Category category = categoryService.find(id);

        return category != null
                ? new ResponseEntity<>(category, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "")
    public ResponseEntity<?> put(@RequestBody Category category){
        categoryService.create(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/api/categories/{id}")
    public ResponseEntity<?> deleteById(@PathVariable(name="id") Long id){
        categoryService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

