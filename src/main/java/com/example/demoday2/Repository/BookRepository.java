package com.example.demoday2.Repository;

import com.example.demoday2.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
