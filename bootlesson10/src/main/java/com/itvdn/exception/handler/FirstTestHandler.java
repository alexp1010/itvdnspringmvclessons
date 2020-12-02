package com.itvdn.exception.handler;

import com.itvdn.exception.FirstTestException;
import com.itvdn.exception.MainTestException;
import com.itvdn.exception.SecondTestException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class FirstTestHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(FirstTestException.class)
    public ResponseEntity handleFirstException(Exception ex, WebRequest webRequest) {
        return handleExceptionInternal(ex,
                                        "first test exception",
                                        new HttpHeaders(),
                                        HttpStatus.FORBIDDEN,
                                        webRequest);
    }

    @ExceptionHandler(MainTestException.class)
    public ResponseEntity handleMainExceptionGroup(Exception ex, WebRequest webRequest) {
        return handleExceptionInternal(ex,
                                        "group test exception: " + ex.getClass().getName(),
                                        new HttpHeaders(),
                                        HttpStatus.CONFLICT,
                                        webRequest);
    }

    @ExceptionHandler(SecondTestException.class)
    public ResponseEntity handleSecondException(Exception ex, WebRequest webRequest) {
        return handleExceptionInternal(ex,
                                        "second test exception",
                                        new HttpHeaders(),
                                        HttpStatus.CONFLICT,
                                        webRequest);
    }
}
