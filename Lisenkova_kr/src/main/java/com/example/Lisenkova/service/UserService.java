package com.example.Lisenkova.service;

import com.example.Lisenkova.entity.User;
import com.example.Lisenkova.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void create(User user){
        userRepository.save(user);
    }

    public List<User> findAll (){
        return userRepository.findAll();
    }

    public User find(Long id){
        return userRepository.getOne(id);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}

