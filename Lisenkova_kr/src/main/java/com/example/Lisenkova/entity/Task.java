package com.example.Lisenkova.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "task")
@Entity
public class Task extends BaseEntity {

    private String name;
    private String description;
    private String completionDate;
    private Boolean isDone;


//    @JoinTable(name = "task_category",
//               joinColumns = @JoinColumn(name = "task_id"),
//               inverseJoinColumns = @JoinColumn(name = "category_id"))
    @ManyToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
    private List<Category> categories=new ArrayList<>();

    @ManyToOne
//    @JoinColumn(name="user_id", nullable = false)
    private User user;
}
