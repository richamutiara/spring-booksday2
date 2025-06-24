package com.example.demoday2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
