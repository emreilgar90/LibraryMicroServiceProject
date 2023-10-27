package com.emre.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ErrorType {

        ISBN_NOT_FOUND(4100,"Isbn not found !",HttpStatus.BAD_REQUEST),
        ID_NOT_FOUND(4110,"Id not found !" ,HttpStatus.BAD_REQUEST),
        BAD_REQUEST(4100,"Parameter Error",HttpStatus.BAD_REQUEST),
        INTERNAL_ERROR(5100,"An unexpected error occurred on the server",HttpStatus.INTERNAL_SERVER_ERROR);


        int code;
        String message;
        HttpStatus httpStatus;


}
