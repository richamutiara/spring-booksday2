package com.example.demoday2.Repository;

import com.example.demoday2.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository <Category, Long> {


    Optional<Category> findByName(String name);

}
