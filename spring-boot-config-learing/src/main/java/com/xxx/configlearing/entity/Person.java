package com.xxx.configlearing.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private Integer id;
    private String name;
    private List<String> hobbies;
    private String[] family;
    private Map map;
    private Pet pet;


}
