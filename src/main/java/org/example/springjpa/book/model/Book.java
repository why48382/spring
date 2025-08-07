package org.example.springjpa.book.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private Long id;
    private String title;
    private Integer pageNum;
    private String price;

    @OneToMany(mappedBy = "book")
    private List<Review> reviews = new ArrayList<>();
}

