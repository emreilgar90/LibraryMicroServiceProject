package com.emre.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ErrorType {

        ISBN_NOT_FOUND(4100,"Isbn not found !",HttpStatus.BAD_REQUEST),
        ID_NOT_FOUND(4110,"Id not found !" ,HttpStatus.BAD_REQUEST),
        BAD_REQUEST(4100,"Parametre Hatası",HttpStatus.BAD_REQUEST),
        LIBRARY_NOT_FOUND_EXCEPTION(4110,"Kütüphane bulunamadı",HttpStatus.BAD_REQUEST),

        INTERNAL_ERROR(5100,"Sunucuda beklenmeyen hata oluştu",HttpStatus.INTERNAL_SERVER_ERROR);



        int code;
    String message;
    HttpStatus httpStatus;


}
