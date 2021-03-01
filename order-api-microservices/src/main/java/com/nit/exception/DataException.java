package com.nit.exception;

import lombok.Getter;

@Getter
public class DataException extends RuntimeException {

    private String httpStatusCode;
    private String serviceErrorCod;
    private String errorDescription;
    private String errorDetail;

    public DataException(String message){
        super(message);
    }

    public DataException(final Throwable cause){
        super(cause);
    }
}
