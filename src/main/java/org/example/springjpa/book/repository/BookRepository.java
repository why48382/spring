package org.example.springjpa.book.repository;

import org.example.springjpa.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
