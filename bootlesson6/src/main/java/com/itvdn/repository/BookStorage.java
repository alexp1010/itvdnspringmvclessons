package com.itvdn.repository;

import com.itvdn.model.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BookStorage {
    private Map<Long, Book> books;
    private boolean connectionEstablished = false;

    public void initStorage() {
        books = new HashMap<>();
    }

    public void connect() {
        if (!connectionEstablished) {
            initStorage();
            connectionEstablished = true;
        }
    }

    public void addBook(Book book) {
        if (connectionEstablished) {
            long nextId = books.size() + 1;
            books.put(nextId, book);
        }
    }

    public void updateBook(Book book) {
        if (connectionEstablished) {
            //if(getBook(book.getId()) != null) {
                // to do
            //}
        }
    }

    public Book getBook(long id) {
        Book book = null;
        if (connectionEstablished) {
            book = books.get(id);
        }
        return book;
    }

    public Collection<Book> getBooks() {
        return books.values();
    }

    public long getBooksNumber() {
        return books.size();
    }
}