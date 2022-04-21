package com.example.alphavarient.BoredAPI;

import com.example.alphavarient.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class BoredAPIControllerImpl implements BoredAPIController {

    public static final int MIN = 0;
    public static final int MAX = 12;

    @Autowired
    Logger logger;

//    Using responseStatus to return a status code the request
    @Override
    @GetMapping(value = "/bored")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public BoredAPIResponse suggestActivity() {
        return createResponse();
    }

    @Override
    public BoredAPIResponse createResponse() {
        logger.log("Call ==> boredAPI.createResponse()", Logger.LoggingLevel.INFO);
        int responseNumber = (int)(Math.random()*(MAX - MIN) + MIN);
//        int responseNumber = 1;
        BoredAPIResponse boredAPIResponse = new BoredAPIResponse();
        boredAPIResponse.setActivitySuggestion(boredAPIResponse.getActivity(responseNumber));
        logger.log(boredAPIResponse.toString(), Logger.LoggingLevel.INFO);
        return boredAPIResponse;
    }
}
