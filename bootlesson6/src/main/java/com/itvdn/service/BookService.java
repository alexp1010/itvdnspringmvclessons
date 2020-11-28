package com.itvdn.service;

import com.itvdn.model.Book;
import com.itvdn.repository.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookStorage bookStorage;

    public void addBook(Book book) {
        bookStorage.connect();
        bookStorage.addBook(book);
    }

    public Book getBook(long id) {
        bookStorage.connect();
        return bookStorage.getBook(id);
    }

    public long getBooksNumber() {
        bookStorage.connect();
        return bookStorage.getBooksNumber();
    }
}
