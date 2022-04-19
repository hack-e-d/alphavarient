package com.example.alphavarient.BoredAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoredAPIControllerImpl implements BoredAPIController {
    @Override
    @GetMapping(value = "/bored")
    @ResponseBody
    public BoredAPIResponse suggestActivity() {
        return new BoredAPIResponse().createResponse();
    }
}
