package com.example.services;

import com.example.db.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book save(Book book);

    Book getBookById(int id);
}
