package com.example.demoday2.Repository;

import com.example.demoday2.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {

}
