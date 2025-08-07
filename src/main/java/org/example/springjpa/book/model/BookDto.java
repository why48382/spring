package org.example.springjpa.book.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

public class BookDto {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BookReq {
        private Long id;
        private String title;
        private Integer pageNum;
        private String price;

        public Book toEntity() {
            return Book.builder()
                    .id(id)
                    .title(title)
                    .pageNum(pageNum)
                    .price(price)
                    .build();
        }
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BookRes {
        private Long id;
        private String title;
        private Integer pageNum;
        private String price;
        private List<ReviewDto.ReviewRes> reviews;

        public static BookRes fromEntity(Book book) {
            return BookRes.builder()
                    .id(book.getId())
                    .title(book.getTitle())
                    .pageNum(book.getPageNum())
                    .price(book.getPrice())
                    .reviews(book.getReviews().stream().map(ReviewDto.ReviewRes::fromEntity).collect(Collectors.toList()))
                    .build();
        }
    }
}

