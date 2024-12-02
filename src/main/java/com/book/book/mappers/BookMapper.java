package com.book.book.mappers;

import com.book.book.dtos.BookRequest;
import com.book.book.dtos.BookResponse;
import com.book.book.entities.Book;

public class BookMapper {
    public static BookResponse toDTO(Book book){
        return new BookResponse(
            book.getId(),
            book.getTitle(),
            book.getAuthor(),
            book.getDescription(),
            book.getYear());
    }

    public static Book toEntity(BookRequest bookRequest){
        Book book = new Book();
        book.setTitle(bookRequest.title());
        book.setAuthor(bookRequest.author());
        book.setDescription(bookRequest.description());
        book .setYear(bookRequest.year());

        return book;
    }  
}
