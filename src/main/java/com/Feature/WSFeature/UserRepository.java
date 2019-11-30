package com.Feature.WSFeature;

import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAllByName (@NotBlank String name);
    List<User> findAll();

}
