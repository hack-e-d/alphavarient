package com.example.alphavarient.DataTime;

public class DateTimeResponse {
    private String Date = null;
    private String Time = null;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public DateTimeResponse(String date, String time) {
        Date = date;
        Time = time;
    }
}
