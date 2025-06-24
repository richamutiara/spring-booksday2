package com.example.demoday2.Service;

import com.example.demoday2.Book;
import com.example.demoday2.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    // Get All Books
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    // Add and update book
    public Book saveBook(Book book) {
        return repo.save(book);
    }

}
