package com.sipankaj.billingaccount.config;

import com.sipankaj.billingaccount.model.UserProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class ApplicationConfig {
}
