package com.sanbeso.dater.web.to;

import java.io.Serializable;
import java.util.List;

public class GeneralTO implements Serializable {

    protected transient List<String> errors;

    protected String status;

    protected String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {

        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
