package com.xxx.configlearing.config;

import com.xxx.configlearing.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements DBconfig {



    @Override
    public String configure() {
        return "TestConfig";
    }
}
