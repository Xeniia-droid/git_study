package com.Feature.WSFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/users")
    @ResponseBody
    public User createUser (@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(path = "/users/{id}")
    @ResponseBody
    public Optional<?> findById (@RequestParam int id) throws IOException {
        return userRepository.findById(id);
    }

    @GetMapping(path = "/users")
    @ResponseBody
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/users/name")
    @ResponseBody
    public List<User> findAllByName (@RequestParam String name) {
        return userRepository.findAllByName(name);
    }
}
