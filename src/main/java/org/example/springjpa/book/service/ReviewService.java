package org.example.springjpa.book.service;

import lombok.RequiredArgsConstructor;
import org.example.springjpa.book.model.ReviewDto;
import org.example.springjpa.book.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public void save(ReviewDto.ReviewReq dto) {
        reviewRepository.save(dto.toEntity());
    }
}
