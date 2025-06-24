package com.example.demoday2.Controller;

import com.example.demoday2.Book;
import com.example.demoday2.Category;
import com.example.demoday2.DTO.BookAndCategoryRequest;
import com.example.demoday2.Service.BookService;
import com.example.demoday2.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @PostMapping("/category")
    public boolean addBookAndCategory(@RequestBody BookAndCategoryRequest bookAndCategoryRequest){
        System.out.println("add Book & category :" + bookAndCategoryRequest);
        return categoryService.saveBookAndCategory(bookAndCategoryRequest);
    }
}
