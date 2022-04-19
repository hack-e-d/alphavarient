package com.example.alphavarient.DataTime;

import com.example.alphavarient.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
public class DateTimeController {
    @Autowired
    Logger logger;

    private DateTimeFormatter dateTimeFormatter;
    public LocalDateTime localDateTime = LocalDateTime.now();


    @GetMapping(value = "/date")
    @ResponseBody
    public DateTimeResponse getDate() {
        logger.log("Date and Time fetched", Logger.LoggingLevel.INFO);
        return new DateTimeResponse(dateConstructor() ,timeConstructor());
    }

    private String dateConstructor() {
        StringBuilder date = new StringBuilder();
        date.append(localDateTime.getDayOfMonth());
        date.append("/");
        date.append(localDateTime.getMonthValue());
        date.append("/");
        date.append(localDateTime.getYear());
        return date.toString();
    }

    private String timeConstructor() {
        StringBuilder time = new StringBuilder();
        time.append(localDateTime.getHour());
        time.append(":");
        time.append(localDateTime.getMinute());
        time.append(":");
        time.append(localDateTime.getSecond());
        return time.toString();
    }
}
