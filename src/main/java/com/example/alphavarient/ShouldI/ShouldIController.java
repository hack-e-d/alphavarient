package com.example.alphavarient.ShouldI;

import org.springframework.web.bind.annotation.RequestParam;

public interface ShouldIController {

    public ShouldIResponse sendResponse(@RequestParam("question") String question);

    public String generateResponse(ShouldIResponse shouldIResponse);
}
