package com.example.Lisenkova.repository;

import com.example.Lisenkova.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long > {

}
