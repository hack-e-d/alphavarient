package com.example.alphavarient.BoredAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoredAPIResponse {
    private final List<String> activities = new ArrayList<String>(Arrays.asList(new String[]{"make a site", "play chess", "bake a cake", "go out with friends"}));
    private String activitySuggestion = null;

    public BoredAPIResponse() {

    }
    public BoredAPIResponse(String activitySuggestion) {
        this.activitySuggestion = activitySuggestion;
    }

    public String getActivitySuggestion() {
        return activitySuggestion;
    }

    public String getActivity(int i) {
        return activities.get(i);
    }

    public void setActivitySuggestion(String activitySuggestion) {
        this.activitySuggestion = activitySuggestion;
    }

    public BoredAPIResponse createResponse() {
        int responseNumber = 1;
        BoredAPIResponse boredAPIResponse = new BoredAPIResponse();
        boredAPIResponse.setActivitySuggestion(boredAPIResponse.getActivity(responseNumber));
        return boredAPIResponse;
    }
}
