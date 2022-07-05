package com.example.alphavarient.BoredAPI;

import com.example.alphavarient.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoredServiceImpl implements BoredService {

    public static final int MIN = 0;
    public static final int MAX = 12;

    @Autowired
    Logger logger;

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
