package com.example.alphavarient.BoredAPI;

import com.example.alphavarient.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

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
}
