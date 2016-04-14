package com.sanbeso.dater.core.exception;

/**
 * Generic persistence exception
 *
 * @author Jose Beas
 * @version 1.0
 */
public class PersistenceException extends Exception {

    /**
     *
     * @param message
     */
    public PersistenceException(String message){
        super(message);
    }

    /**
     *
     * @param message
     * @param throwable
     */
    public PersistenceException(String message, Throwable throwable){
        super(message, throwable);
    }

}
