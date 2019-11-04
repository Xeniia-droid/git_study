package com.Feature.WSFeature;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class UserController {
    private AtomicInteger countr = new AtomicInteger();
    @RequestMapping("/createUser")
     public User createUser (@RequestParam(value = "name", defaultValue = "???") String name) {
         return new User(countr.incrementAndGet(),name); //
     }
}
