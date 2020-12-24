package com.axis.blaze.exception;

import org.springframework.http.HttpStatus;
import com.axis.blaze.response.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BlazeExceptionHandler {

    @ExceptionHandler(BlazeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse genericThrowable(BlazeException e) {
        return new ErrorResponse("500", e.message);
    }
}
