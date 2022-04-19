package com.example.alphavarient.ShouldI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShouldIResponse {
    private String question = null;
    private String response = null;

    private static final List<String> responses = new ArrayList<String>(Arrays.asList(new String[]{"YES!","NO!"}));

    public ShouldIResponse(){

    }

    public String getResponse(int i){
        return responses.get(i);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
