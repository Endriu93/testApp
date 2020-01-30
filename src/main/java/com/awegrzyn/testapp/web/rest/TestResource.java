package com.awegrzyn.testapp.web.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/test")
public class TestResource {

    public TestResource() {}

    @GetMapping("/get")
    public String get(@RequestParam("name") Optional<Boolean> isUsed) {
        return String.valueOf(isUsed.orElse(false));
    }
}
