package com.web.client_config.controller;

import com.web.client_config.ClientConfigApplication;
import com.web.client_config.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/app")
public class RootController {

    @Autowired
    AppProperties appProperties;

    @GetMapping("/getProps")
    public String getProperties(){
        return appProperties.toString();
    }
}
