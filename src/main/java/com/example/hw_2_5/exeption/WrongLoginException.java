package com.example.hw_2_5.exeption;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String massage){
        super(massage);
    }
}
