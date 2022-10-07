package com.leonardo.toolsChallenge.pattern.exception;

public class ObjectNotFountException extends RuntimeException {

    public ObjectNotFountException() {
        super();
    }
    public ObjectNotFountException(String msg) {
        super(msg);
    }

    public ObjectNotFountException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
