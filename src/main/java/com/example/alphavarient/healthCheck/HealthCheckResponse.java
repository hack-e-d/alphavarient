package com.example.alphavarient.healthCheck;

public class HealthCheckResponse {
    private String STATUS = null;

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public HealthCheckResponse(String status) {
        setSTATUS(status);
    }

    @Override
    public String toString() {
        return "HealthCheckResponse{" +
                "STATUS='" + STATUS + '\'' +
                '}';
    }
}
