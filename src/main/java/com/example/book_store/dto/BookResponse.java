package com.example.book_store.dto;

import com.example.book_store.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookResponse {

    private Long id;
    private String title;
    private String author;
    private int price;
    private int stock;

    public static BookResponse from(Book book) {
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor(),
                book.getPrice(), book.getStock());
    }
}
