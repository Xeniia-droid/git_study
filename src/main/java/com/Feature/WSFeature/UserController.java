package com.Feature.WSFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class UserController {

    private AtomicInteger countr = new AtomicInteger();

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    @ResponseBody
    public User createUser (@RequestBody User user) {
        String name = user.getName();
        return userRepository.save(new User(countr.incrementAndGet(),name));
    }
    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<User> findById (@RequestParam String id) {
        return userRepository.findById(Integer.parseInt(id));
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @RequestMapping(path = "/users/name=x", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> findAllByName (@RequestParam String name) {
        return userRepository.findAllByName(name);
    }


}
