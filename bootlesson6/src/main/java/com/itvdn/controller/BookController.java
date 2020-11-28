package com.itvdn.controller;

import com.itvdn.converter.BookConverter;
import com.itvdn.dto.CreateBookRequest;
import com.itvdn.model.Book;
import com.itvdn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(path = "/getnumber")
    public ResponseEntity getBooksNumber() {
        long booksNumber = bookService.getBooksNumber();
        return new ResponseEntity(booksNumber, HttpStatus.OK);
    }

    @PutMapping(path = "/updateuser")
    public ResponseEntity updateUser(@RequestBody CreateBookRequest createBookRequest) {
        Book book = new BookConverter().apply(createBookRequest);
        bookService.addBook(book);
        return new ResponseEntity(HttpStatus.OK);
    }
}
