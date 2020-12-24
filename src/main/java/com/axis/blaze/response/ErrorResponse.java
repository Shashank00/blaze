package com.axis.blaze.response;

public class ErrorResponse {
    private String errorCode;
    private String message;

    public ErrorResponse(String errorCode, String message){
        this.errorCode = errorCode;
        this.message = message;
    }
}
