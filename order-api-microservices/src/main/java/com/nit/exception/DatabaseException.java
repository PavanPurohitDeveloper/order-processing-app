package com.nit.exception;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String message){
        super(message);
    }

    public DatabaseException(final Throwable cause){
        super(cause);
    }
}
