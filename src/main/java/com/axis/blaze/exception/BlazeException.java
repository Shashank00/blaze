package com.axis.blaze.exception;

public class BlazeException extends Throwable {

    public String message;

    public BlazeException(String message, String blazeExceptionMessage) {
        super(message);
        this.message = blazeExceptionMessage;
    }
}
