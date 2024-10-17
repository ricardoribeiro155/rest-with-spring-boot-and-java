package br.com.rest_with_spring_boot_and_java.Exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    @Serial
    private static final long serialVersionUID= 1L;
    private Date timetamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details){
        this.timetamp = timestamp;
        this.message = message;
        this.details =  details;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimetamp() {
        return timetamp;
    }

    public void setTimetamp(Date timetamp) {
        this.timetamp = timetamp;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
