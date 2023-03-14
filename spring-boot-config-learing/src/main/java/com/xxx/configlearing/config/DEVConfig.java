package com.xxx.configlearing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DEVConfig implements DBconfig {



    @Override
    public String configure() {
        return "DEVConfig";
    }
}
