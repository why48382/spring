package org.example.springjpa.book.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    private Long id;
    private String content;
    private Double score;

    @ManyToOne
    @JoinColumn(name = "book_id")  // 외래 키 컬럼
    private Book book;
}
