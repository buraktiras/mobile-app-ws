package com.appsdeveloperblog.app.ws.ui.model.response;

import java.util.Date;

public class ErrorMessage {
    private Date timestanp;
    private String message;

    public ErrorMessage(){}
    public ErrorMessage(Date timestanp, String message){
        this.timestanp = timestanp;
        this.message=message;
    }

    public Date getTimestanp() {
        return timestanp;
    }

    public void setTimestanp(Date timestanp) {
        this.timestanp = timestanp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
