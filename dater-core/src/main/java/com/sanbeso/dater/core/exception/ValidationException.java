package com.sanbeso.dater.core.exception;

/**
 * Generic validation exception
 *
 * @author Jose Beas
 * @version 1.0
 */
public class ValidationException extends Exception {

    /**
     *
     * @param message
     */
    public ValidationException(String message){
        super(message);
    }

    /**
     *
     * @param message
     * @param throwable
     */
    public ValidationException(String message, Throwable throwable){
        super(message, throwable);
    }

}
