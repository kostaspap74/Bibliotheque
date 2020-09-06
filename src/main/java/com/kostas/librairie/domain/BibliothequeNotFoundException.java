package com.kostas.librairie.domain;

import org.springframework.http.HttpStatus;

public class BibliothequeNotFoundException extends RuntimeException{


    private final HttpStatus httpstatus;

    public BibliothequeNotFoundException(HttpStatus httpStatus, String s) {
        super(s);
        this.httpstatus = httpStatus;
    }
}
