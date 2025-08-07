package org.example.springjpa.book.controller;

import lombok.RequiredArgsConstructor;
import org.example.springjpa.book.model.BookDto;
import org.example.springjpa.book.model.ReviewDto;
import org.example.springjpa.book.service.BookService;
import org.example.springjpa.book.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookContorller {
    private final BookService bookService;
    private final ReviewService reviewService;

    @PostMapping("/resister")
    public ResponseEntity resister(@RequestBody BookDto.BookReq dto) {
        bookService.save(dto);
        return ResponseEntity.status(200).body("저장 성공");
    }

    @PostMapping("/review")
    public ResponseEntity review(@RequestBody ReviewDto.ReviewReq dto) {
        reviewService.save(dto);
//        둘 중 하나 사용
        return ResponseEntity.status(200).body("저장 성공");
    }

//    @GetMapping("/list")
//    public ResponseEntity list() {
//        List<BookDto.BookRes> response = bookService.list();
//        return ResponseEntity.status(200).body(response);
//    }
//
//    @GetMapping("/read")
//    public ResponseEntity read(Integer id) {
//        BookDto.BookRes response = bookService.read(id);
//        return ResponseEntity.status(200).body(response);
//    }
}
