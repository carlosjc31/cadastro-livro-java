package com.book.book.dtos;

public record BookResponse(
    Long id,
    String title,
    String author,
    String description,
    int year
) {
    
}
