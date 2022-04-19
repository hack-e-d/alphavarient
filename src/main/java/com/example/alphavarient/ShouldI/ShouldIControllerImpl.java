package com.example.alphavarient.ShouldI;

import com.example.alphavarient.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShouldIControllerImpl implements ShouldIController {

    public static final int MIN = 0;
    public static final int MAX = 2;

    @Autowired
    Logger logger;

    @Override
    @PostMapping(value = "/should-i")
    @ResponseBody
    public ShouldIResponse sendResponse(@RequestParam("question") String question) {
        ShouldIResponse shouldIResponse = new ShouldIResponse();
        shouldIResponse.setQuestion(question);
        shouldIResponse.setResponse(generateResponse(shouldIResponse));
        return shouldIResponse;
    }

    @Override
    public String generateResponse(ShouldIResponse shouldIResponse) {
        logger.log("Call ==> shouldIController.generateResponse()", Logger.LoggingLevel.INFO);
        int responseNumber = (int)(Math.random()*(MAX - MIN) + MIN);
        String response = shouldIResponse.getResponse(responseNumber);
//        int responseNumber = 1;
        logger.log("Response Given : "+ response, Logger.LoggingLevel.INFO);
        return response;
    }
}
