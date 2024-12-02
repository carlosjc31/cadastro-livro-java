package com.book.book.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book.dtos.BookResponse;
import com.book.book.mappers.BookMapper;
import com.book.book.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;
    
    public List<BookResponse> getAllBook(){
        return repository.findAll().stream().map(b ->BookMapper.toDTO(b)).collect(Collectors.toList());
    }
}
