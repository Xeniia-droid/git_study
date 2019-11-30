package com.Feature.WSFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
    public User findUserById (@PathVariable int id)  {
        Optional<User> users = userRepository.findById(id);
            return users.orElseThrow(()-> new NotFoundException());

    }

    @GetMapping(path = "/users")
    @ResponseBody
    public List<User> findAllUser(@RequestParam(value = "name", required = false) String name) {

            if (name==null)
                return userRepository.findAll();

            else
                return userRepository.findAllByName(name);

    }

    /*@GetMapping(path = "/users/name")
    @ResponseBody
    public List<User> findAllByName (@RequestParam String name) {
        return userRepository.findAllByName(name);
    }*/
}
