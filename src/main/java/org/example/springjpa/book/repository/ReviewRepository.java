package org.example.springjpa.book.repository;

import org.example.springjpa.book.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
