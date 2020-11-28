package com.itvdn.converter;

import com.itvdn.dto.CreateBookRequest;
import com.itvdn.model.Book;

public class BookConverter implements GenericConverter<CreateBookRequest, Book> {
    @Override
    public Book apply(CreateBookRequest createBookRequest) {
        Book book = new Book();
        book.setName(createBookRequest.getName());
        book.setAuthor(createBookRequest.getAuthor());
        return null;
    }
}
