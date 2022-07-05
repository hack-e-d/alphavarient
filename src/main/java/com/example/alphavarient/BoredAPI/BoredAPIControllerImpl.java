package com.example.alphavarient.BoredAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.example.alphavarient.BoredAPI.BoredServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class BoredAPIControllerImpl implements BoredAPIController {

    @Autowired
    BoredServiceImpl boredService;

//    Using responseStatus to return a status code the request
    @Override
    @GetMapping(value = "/bored")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public BoredAPIResponse suggestActivity() {
        return boredService.createResponse();
    }

}
