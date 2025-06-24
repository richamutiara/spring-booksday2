package com.example.demoday2.Service;
import com.example.demoday2.Book;
import com.example.demoday2.Category;
import com.example.demoday2.DTO.BookAndCategoryRequest;
import com.example.demoday2.Repository.BookRepository;
import com.example.demoday2.Repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Transactional
    public Boolean saveBookAndCategory(BookAndCategoryRequest request) {
        Optional<Category> optionalCategory = categoryRepository.findByName(request.getCategoryBook());

        Category category = optionalCategory.orElse(
                Category.builder()
                        .name(request.getCategoryBook())
                        .categoryDescription(request.getCategoryBook()) // make this description different later by the api design
                        .books(new ArrayList<>())
                        .build()
        );

        Book book = Book.builder()
                .title(request.getTitle())
                .author(request.getAuthor())
                .yearPublished(request.getYearPublished())
                .build();

        category.getBooks().add(book);
        book.setCategory(category);

        bookRepository.save(book);
        categoryRepository.save(category);
        return true;
    }
}
