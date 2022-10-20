package com.example.hw_2_5.exeption;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String massage){
        super(massage);

    }
}
