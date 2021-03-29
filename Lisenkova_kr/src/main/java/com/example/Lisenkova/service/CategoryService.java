package com.example.Lisenkova.service;

import com.example.Lisenkova.entity.Category;
import com.example.Lisenkova.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void create(Category category){
        categoryRepository.save(category);
    }

    public List<Category> findAll (){
        return categoryRepository.findAll();
    }

    public Category find(Long id){
        return categoryRepository.getOne(id);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

}
