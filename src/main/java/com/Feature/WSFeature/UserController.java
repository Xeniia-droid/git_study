package com.Feature.WSFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class UserController {

    private AtomicInteger countr = new AtomicInteger();

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public User createUser (@RequestParam(value = "name") String name) {
        return new User(countr.incrementAndGet(),name);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
     public Optional<User> findById (@RequestParam(value = "id") int id) {
        return userRepository.findById(id);
     }

    @RequestMapping(value = "/users?name=x", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAllByName (@RequestParam(value = "name") String name) {
        return userRepository.findAllByName(name);
    }


}
