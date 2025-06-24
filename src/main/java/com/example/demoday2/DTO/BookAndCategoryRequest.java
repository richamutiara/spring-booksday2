package com.example.demoday2.DTO;

import com.example.demoday2.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookAndCategoryRequest {
    private Long id;
    private String title;
    private String author;
    private int yearPublished;
    private String categoryBook;
    private String bookDescription;
}
