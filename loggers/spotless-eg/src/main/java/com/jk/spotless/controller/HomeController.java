package com.jk.spotless.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junaid.Khan
 */
 
@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/hello")
    public String hello() {

        logger.debug("logger is called");
        return "Hello, World!";
    }
}
