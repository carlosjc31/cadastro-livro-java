package com.book.book.dtos;

import jakarta.validation.constraints.NotBlank;

public record BookRequest(
    
    @NotBlank(message = "Title cannot be blank")
    String title,

    @NotBlank(message = "Author cannot be blank")
    String author,

    @NotBlank(message = "Description cannot be blank")
    String description,

    @NotBlank(message = "Year cannot be blank")
    int year
) {
    
}
