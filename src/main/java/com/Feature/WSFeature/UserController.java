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

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    @ResponseBody
    public User createUser (@RequestParam String name) {
        return userRepository.save(new User(countr.incrementAndGet(),name));
    }

    @RequestMapping(path = "/users/all", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @RequestMapping(path = "/users/byId", method = RequestMethod.GET)
    @ResponseBody
     public Optional<User> findById (@RequestParam int id) {
        return userRepository.findById(id);
      //  System.out.println("Im here");
      //  return "it works";
     }

    @RequestMapping(path = "/users/AllByName", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAllByName (@RequestParam String name) {
        return userRepository.findAllByName(name);
    }


}
