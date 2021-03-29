package com.example.Lisenkova.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


//@Table(name = "category")
@Entity
public class Category extends BaseEntity{

    private String name;

    @ManyToMany ( fetch = FetchType.LAZY)
    private Set<Task> tasks =new HashSet<>();
}
