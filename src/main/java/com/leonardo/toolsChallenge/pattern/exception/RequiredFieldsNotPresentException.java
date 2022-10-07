package com.leonardo.toolsChallenge.pattern.exception;

public class RequiredFieldsNotPresentException extends RuntimeException {

    public RequiredFieldsNotPresentException(String msg) {
        super(msg);
    }

    public RequiredFieldsNotPresentException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
