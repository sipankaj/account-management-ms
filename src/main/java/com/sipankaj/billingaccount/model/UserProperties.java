package com.sipankaj.billingaccount.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "app.config")
public record UserProperties (String namePrefix){
    public UserProperties {
        if (namePrefix == null)  {
            throw new IllegalArgumentException("namePrefix");
        }
    }
}
