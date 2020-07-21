package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bileto")
public class SymplaPayProperties {

    private String symplaPayUrl;

    public String getSymplaPayUrl() {
        return symplaPayUrl;
    }

    public void setSymplaPayUrl(String symplaPayUrl) {
        this.symplaPayUrl = symplaPayUrl;
    }
}
