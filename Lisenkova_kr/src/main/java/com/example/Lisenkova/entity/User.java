package com.example.Lisenkova.entity;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

//@Table(name = "user")
@Entity
public class User extends BaseEntity{

    private String login;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String birthDate;

    @OneToMany(mappedBy="user")
    private Set<Task> tasks;

}
