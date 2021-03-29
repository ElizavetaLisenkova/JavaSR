package com.example.Lisenkova.repository;

import com.example.Lisenkova.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long > {

}
