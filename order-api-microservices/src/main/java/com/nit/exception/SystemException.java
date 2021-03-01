package com.nit.exception;
import lombok.Getter;

@Getter
public class SystemException extends RuntimeException {

    private String httpStatusCode;
    private String serviceErrorCod;
    private String errorDescription;
    private String errorDetail;
}
