package org.example.springjpa.book.service;

import lombok.RequiredArgsConstructor;
import org.example.springjpa.book.model.BookDto;
import org.example.springjpa.book.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void save(BookDto.BookReq dto) {
        bookRepository.save(dto.toEntity());
    }
}
