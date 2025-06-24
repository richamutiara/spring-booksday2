package com.example.demoday2;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


//to make database Book in ORM.
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // as a primary key

    private String title;
    private String author;
    private int yearPublished;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @JsonBackReference
    private Category category;
}
