package com.emre.exception;

import lombok.Getter;

@Getter
public class BookServiceManagerException extends RuntimeException{
    private final ErrorType errorType;

    public BookServiceManagerException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public BookServiceManagerException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}
