package com.book.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.book.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
