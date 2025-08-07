package org.example.springjpa.book.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ReviewDto {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReviewRes {
        private Long id;
        private String content;
        private Double score;

        public static ReviewRes fromEntity(Review review) {
            return ReviewRes.builder()
                    .id(review.getId())
                    .content(review.getContent())
                    .score(review.getScore())
                    .build();
        }


    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReviewReq {
        private Long id;
        private String content;
        private Double score;

        public Review toEntity() {
            Review entity = Review.builder()
                    .id(id)
                    .content(content)
                    .score(score)
                    .build();
            return entity;
        }
    }
}
