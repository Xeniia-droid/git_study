package com.Feature.WSFeature;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAllByName (String name);
}
