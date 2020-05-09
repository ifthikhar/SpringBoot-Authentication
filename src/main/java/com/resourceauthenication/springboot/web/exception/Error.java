package com.resourceauthenication.springboot.web.exception;

public class Error {

    String errorName;
    int status;
    String description;

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  Error()
    {
        super();
    }

    public Error(String errorName, int status, String description)
    {
        this.errorName = errorName;
        this.description = description;
        this.status = status;
    }
}
