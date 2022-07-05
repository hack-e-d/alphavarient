package com.example.alphavarient.BoredAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BoredServiceIntegratingTest {

    @Autowired
    private BoredServiceImpl boredService;

    @Test
    public void testCreateResponse() {

//        getting a response from the function and storing it in boredAPIResponse object
        BoredAPIResponse boredAPIResponse = boredService.createResponse();

//        comparing and checking the response got
        assertNotNull(boredAPIResponse);
        assertNotNull(boredAPIResponse.getActivitySuggestion());
    }
}
