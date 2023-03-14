package com.xxx.configlearing.controller;

import com.xxx.configlearing.config.DBconfig;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DBController {
    private  DBconfig dBconfig;
    @RequestMapping("/dev")
    public String dev() {
        return dBconfig.configure();
    }
}
