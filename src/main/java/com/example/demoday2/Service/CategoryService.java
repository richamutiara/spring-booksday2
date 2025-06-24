package com.example.demoday2.Service;
import com.example.demoday2.Book;
import com.example.demoday2.Category;
import com.example.demoday2.DTO.BookAndCategoryRequest;
import com.example.demoday2.Repository.BookRepository;
import com.example.demoday2.Repository.CategoryRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Transactional
    public Boolean saveBookAndCategory(BookAndCategoryRequest request) {
        Category category = Category.builder()
                .bookCategory(request.getCategoryBook())
                .bookDescription(request.getBookDescription())
                .build();


        Book book = Book.builder()
                .title(request.getTitle())
                .author(request.getAuthor())
                .yearPublished(request.getYearPublished())
                .build();
        
        book.setCategory(category);
        category.setBook(book);

        categoryRepository.save(category);
        return true;
    }
}
