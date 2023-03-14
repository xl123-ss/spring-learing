package com.xxx.configlearing.prop;

import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:my.properties")
@ConfigurationProperties(prefix = "my")
@Setter
@ToString
public class MyProperties {

    private String url;
    private String username;
    private String password;
}
