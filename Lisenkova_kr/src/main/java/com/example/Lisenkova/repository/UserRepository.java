package com.example.Lisenkova.repository;

import com.example.Lisenkova.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long > {

}
