package com.emre.exception;

import lombok.Getter;

@Getter
public class LibraryServiceManagerException extends RuntimeException{
    private final ErrorType errorType;

    public LibraryServiceManagerException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public LibraryServiceManagerException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}
