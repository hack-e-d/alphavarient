package com.example.alphavarient.healthCheck;

import com.example.alphavarient.logging.Logger;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheck {
    public static String status = "";
    @Autowired
    Logger logger;

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        HealthCheck.status = status;
    }

    @GetMapping(value = "/health-check")
    @ResponseBody
    public HealthCheckResponse healthCheck() {
        setStatus("Available");
        logger.log(new HealthCheckResponse(getStatus()).toString(), Logger.LoggingLevel.INFO);
        return new HealthCheckResponse(getStatus());
    }
}
