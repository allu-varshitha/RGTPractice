package com.example.Practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {

    private static final Logger logInfo = LoggerFactory.getLogger(User.class);

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        logInfo.info("logger user enabled ");
        logInfo.debug("logger user debug ");
        logInfo.error("logger user error ");
        logInfo.warn("logger user warn");

        logInfo.trace("logger user trace");

        return "User exists";
    }
}
