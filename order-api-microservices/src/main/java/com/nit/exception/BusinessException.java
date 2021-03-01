package com.nit.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private String httpStatusCode;
    private String serviceErrorCod;
    private String errorDescription;
    private String errorDetail;

}
